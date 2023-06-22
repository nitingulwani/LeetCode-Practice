public class 3Sum {
//beats 22%
     public  List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res  = new HashSet<>();
        if(nums.length==0) return new ArrayList<>(res);
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2;i++){
            int j =i+1;
           int  k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0)res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                else if (sum >0) k--;
                else if (sum<0) j++;
            }

        }
        return new ArrayList<>(res);

    }
}
//

//beats 79%
// public class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> result = new ArrayList<>();
//         if(nums.length < 3) return result;
//         Arrays.sort(nums);
//         int i = 0;
//         while(i < nums.length - 2) {
//             if(nums[i] > 0) break;
//             int j = i + 1;
//             int k = nums.length - 1;
//             while(j < k) {
//                 int sum = nums[i] + nums[j] + nums[k];
//                 if(sum == 0) result.add(Arrays.asList(nums[i], nums[j], nums[k]));
//                 if(sum <= 0) while(nums[j] == nums[++j] && j < k);
//                 if(sum >= 0) while(nums[k--] == nums[k] && j < k);
//             }
//             while(nums[i] == nums[++i] && i < nums.length - 2);
//         }
//         return result;
//     }
// }
