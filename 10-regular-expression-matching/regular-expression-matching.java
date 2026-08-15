class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();

        // dp[i][j] = whether first i characters of s
        // match first j characters of p
        boolean[][] dp = new boolean[m + 1][n + 1];

        // Empty string matches empty pattern
        dp[0][0] = true;

        // Handle patterns like a*, a*b*, a*b*c*
        // which can match an empty string
        for (int j = 2; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                char sChar = s.charAt(i - 1);
                char pChar = p.charAt(j - 1);

                // Case 1:
                // Current characters directly match
                // OR pattern has '.'
                if (pChar == '.' || pChar == sChar) {
                    dp[i][j] = dp[i - 1][j - 1];
                }

                // Case 2: '*'
                else if (pChar == '*') {

                    // '*' means zero occurrences
                    //
                    // Example:
                    // s = "b"
                    // p = "a*b"
                    //
                    // Ignore "a*"
                    dp[i][j] = dp[i][j - 2];

                    // '*' means one or more occurrences
                    //
                    // The character before '*' must match
                    // current s character.
                    if (p.charAt(j - 2) == '.' ||
                        p.charAt(j - 2) == sChar) {

                        dp[i][j] = dp[i][j] || dp[i - 1][j];
                    }
                }
            }
        }

        return dp[m][n];
    }
}