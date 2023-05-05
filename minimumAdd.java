class minimumAdd {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push('(');
            }
            else if(!st.isEmpty() && ch==')' && st.peek()=='('){
                st.pop();
            }
            else{
                st.push(')');
            }
        }
        return st.size();
    }
}
