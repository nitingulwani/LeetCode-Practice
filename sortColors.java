class Solution{
    public void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    public void sortColors(int[] nums){
        int ind = 0;
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            if(nums[start]==0){
                swap(nums, ind, start);
                ind++;
                start++;
            }
            else if(nums[start] == 1){
                // swap(nums, start, ind);
                // ind++;
                start++;
            }
            else if(nums[start] == 2){
                swap(nums, start, end);
                end--;
            }
        }
    }  
}
