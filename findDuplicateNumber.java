class Solution {
    public int findDuplicate(int[] nums) {
        // int i = 0;
        // int j = nums.length-1;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return nums[i];
            }
            set.add(nums[i]);
        }
        return -1;
    }
}
//ishu
