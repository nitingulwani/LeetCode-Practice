class leftandrightSum {
    public int[] leftRightDifference(int[] nums) {
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        left[0]=0;
        right[nums.length-1]=0;
        for(int i=1,j=nums.length-2;i<nums.length && j>=0;i++,j--)
        {
            left[i]=nums[i-1]+left[i-1];
            right[j]=nums[j+1]+right[j+1];
        }
        int ans[]=new int[nums.length];
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=Math.abs(left[i]-right[i]);
        }
        return ans;
    }
}