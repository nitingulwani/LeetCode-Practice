public class removingStars {
        public String removeStars(String s) {
            Stack<Character> stk = new Stack<>();
    
            for(int i = 0; i<s.length(); i++){
                char ch = s.charAt(i);
                if(ch == '*'){
                    stk.pop();
                }
                else{
                    stk.push(ch);
                }
            }
            StringBuilder sb=new StringBuilder();
            while(!stk.isEmpty())
            {
                sb.append(stk.pop());
            }
            sb.reverse();
            return sb.toString();
    
                }
    }
    
