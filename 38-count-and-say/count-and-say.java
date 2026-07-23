class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String s=countAndSay(n-1);
    StringBuilder ans =new StringBuilder();

        int j=0; int i=0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;

            else{
                int fre=j-i;
                ans.append(fre);
                ans.append(s.charAt(i));
                i=j;
            }
        }
       int fre=j-i;
          ans.append(fre);
                ans.append(s.charAt(i));

                return ans.toString();
        
    }
}