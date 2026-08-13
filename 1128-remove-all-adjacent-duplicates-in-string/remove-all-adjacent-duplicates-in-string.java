class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();
        StringBuilder ans = new StringBuilder();
         Stack<Character> st=new Stack<>();
         for(int i=0;i<n;i++){
            char ele=s.charAt(i);
            if(st.isEmpty()){
                st.push(ele);
            }
            else if(ele==st.peek()) {
            st.pop();
            }
            else{
               st.push(ele);
                }
         }

         while(st.size()!=0){
            ans.append(st.pop());
         }
         return ans.reverse().toString();
    }
}