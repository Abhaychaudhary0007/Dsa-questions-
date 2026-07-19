class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int i=0;int j=0;
        int max=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
                j++;
            }
            else{
                int len=j-i;
                max=Math.max(max,len);
                while(s.charAt(i)!=s.charAt(j)){
                    set.remove(s.charAt(i));
                    i++;
                }
                 set.remove(s.charAt(i));
                    i++;
                
            }
        }
         int len=j-i;
                max=Math.max(max,len);
                return max;

    }
}