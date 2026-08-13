class Solution {
    public int calPoints(String[] op) {
        int n=op.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            String s=op[i];
            if(s.equals("C") )st.pop();
            else if(s.equals("D") )st.push(st.peek()*2);
            else if(s.equals("+") ){
                int top=st.pop();
                int sum=top+st.peek();
                st.push(top);
                st.push(sum);
            }
            else st.push(Integer.parseInt(s));
        }
        int ans=0;
        while(st.size()!=0){
            ans+=st.pop();
        }

        return ans;
    }
}