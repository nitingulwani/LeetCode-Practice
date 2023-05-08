class 132pattern {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int ans[] = new int[nums.length];
        ans[0] = nums[0];

        if(nums.length<3){
            return false;
        }

        for(int i = 1; i<nums.length; i++){
            ans[i] = Math.min(ans[i-1], nums[i]);
        }

        for(int i = nums.length-1; i>=0; i--){
            if(nums[i]>ans[i]){
                while(!s.isEmpty() && s.peek() <= ans[i]){
                    s.pop();
                }
                if(!s.isEmpty() && s.peek() < nums[i]){
                    return true;
                }
                s.push(nums[i]);
            }  
        }
        return false;
        
    }
}