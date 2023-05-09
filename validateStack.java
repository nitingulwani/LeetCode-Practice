class validateStack {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> s = new Stack<>();
        int j=0;
        for(int i = 0; i<pushed.length; i++){
            s.push(pushed[i]);
            
            while(!s.isEmpty() && j<popped.length && popped[j] == s.peek()){
                s.pop();
                j++;

            }
        }
        while(!s.isEmpty() && j<popped.length && s.peek() == popped[j] ){
                s.pop();
                j++;
            
        }

        return s.isEmpty();
    }
}