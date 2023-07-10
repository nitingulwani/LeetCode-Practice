class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
//170/266 cases

// class Solution {
//     public void nextPermutation(int[] nums) {
//         int i = nums.length-1;
//         int j = nums.length-2;
//         int temp = 0;
//         int max = nums[0];

//         for(int i = 0; i<nums.length; i++){
//             max = Math.max(nums[i], max);
//         }

//         while(i!=j && i>0 && j>0){
//             if(nums[i] > nums[j]){
//                 temp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j] = temp;
//                 break;
//             }
//             else{
//                 temp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j] = temp;
//                 j--;
//                 i--;
//             }
//         }
//     }
// }
