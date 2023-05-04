class firstAndLastposition {
    public int[] searchRange(int[] nums, int target) {
        int left = 0; 
        int right = nums.length-1;
        int ans[] = new int[2];
   

        if(nums.length == 0){
            return new int[]{-1,-1};
        }
        while(left<right){
            int mid = left + (right-left)/2;
            if(target>nums[mid]){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        if(target == nums[left]){
            ans[0] = left;
        }else{
            ans[0] = -1;
        }

        right = nums.length-1;
        while(left<right){
            int mid = (left + (right-left)/2)+1;

            if(target<nums[mid]){
                right = mid-1;
            }else{
                left = mid;
            }
        }
        if(target == nums[right]){
            ans[1] = right;
        }else{
            ans[1] = -1;
        }
        return ans;
    }
}
