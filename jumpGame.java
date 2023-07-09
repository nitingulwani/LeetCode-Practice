class Solution{
    public boolean canJump(int[] nums) {
    int maxLocation = 0;
    for(int i=0; i<nums.length; i++) {
        if(maxLocation<i){
            return false;
        }
        maxLocation = (i+nums[i]) > maxLocation ? i+nums[i] : maxLocation; // greedy:
    }
    return true;
    }

}

//ONLY 70/172 CASES
// class Solution {
//     public boolean canJump(int[] nums) {
//         int n = nums.length;
//         int ind = 0;
        
//         for (int i = 0; i < n; i++) {
//             if (n - i <= nums[i]) {
//                 ind = nums[i];
//             } 
//             else{
//                 return false;
//             }
//         }
//         if (ind == nums[0]) {
//             return true;
//         } 
//         else{
//             return canJump(nums, ind);
//         }
//     }
    
//     private boolean canJump(int[] nums, int n) {
//         if (n == 0) {
//             return true;
//         }   
//         for (int i = 0; i < n; i++) {
//             if (n - i <= nums[i]) {
//                 return canJump(nums, i);
//             }
//         }
//         return false;
//     }
// }

