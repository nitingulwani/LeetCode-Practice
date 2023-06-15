class targetSumIndex {
    public static int[] targetSum(int[] arr, int target){
        int i = 0;
        int j = 1;
        int[] ans = new int[2];
        
            if(i!=j && arr[i] + arr[j] == target){
                ans[0] = i;
                ans[1] = j;
                return ans;
            }
            else if(i!=j && arr[i] + arr[j] < target){
                j++;
            }
        return ans;
    }
    public static void main(String[] args) {
         int arr[] = {2,6,3,4};
         int target = 8;
         targetSum(arr, target);
    }
}