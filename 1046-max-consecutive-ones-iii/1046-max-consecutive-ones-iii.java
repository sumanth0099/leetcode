class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0;
		int left = 0;
		int z = 0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==0)
			z++;
			while(z>k)
			{
				if(nums[left++]==0)
				z--;
			}
			max=Math.max(i-(left-1),max);
		}
        return max;
    }
}