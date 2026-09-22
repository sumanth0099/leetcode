class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int sol = sum;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>sum && sum<0)
            sum=nums[i];
            else
            sum+=nums[i];
            sol = Math.max(sol,sum);
        }
        return sol;
    }
}