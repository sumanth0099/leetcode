class Solution {
    public int maxSubArray(int[] nums) {
        int min=nums[0];
        int s=0;
        int minNegative=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            s+=nums[i];
            if(min<s)
            min=s;
            if(s<0)
            s=0;
          if(nums[i]>minNegative)
          minNegative=nums[i];
        }
        if(min>0 && min>minNegative )
        return min;
        return minNegative;
    }
}