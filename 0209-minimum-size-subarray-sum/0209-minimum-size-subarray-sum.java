class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int right=0;
		int sum=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<nums.length;i++)
		{
			sum+=nums[i];
				while(sum>=target){
				min=Math.min(min, i-right+1);
				sum-=nums[right++];
					}
		}
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}