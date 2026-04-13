class Solution {
    public int paths(int row,int col,int lrow,int lcol,int [][] dp){
        if(row==lrow && col==lcol) return 1;
        if(row>lrow || col>lcol) return 0;
        if(dp[row][col]!=0) return dp[row][col];
        int right=paths(row,col+1,lrow,lcol,dp);
        int down=paths(row+1,col,lrow,lcol,dp);
        return dp[row][col]=right+down;
    }
    public int uniquePaths(int m, int n) {
         int[][] dp=new int[m+1][n+1];
        return paths(0,0,m-1,n-1,dp);
    }
}