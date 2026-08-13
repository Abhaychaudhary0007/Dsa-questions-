class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        if(n%2!=0) return false;

        Stack<Character> st=new Stack<>();

        for(int i=0;i<n;i++){
            char ele=s.charAt(i);
            if(ele == '(' || ele == '{' || ele == '['){
                st.push(ele);
            }

            if (ele == ')' || ele == '}' || ele == ']') {
                if (st.isEmpty()) return false;
                if (ele == ')' && st.peek() == '(') {
                    st.pop();
                }
                else if (ele == '}' && st.peek() == '{') {
                    st.pop();
                }
                else if (ele == ']' && st.peek() == '[') {
                    st.pop();
                }
                else {
                    return false;
                }
            }  
        }
        

        return   st.isEmpty();
    }
}