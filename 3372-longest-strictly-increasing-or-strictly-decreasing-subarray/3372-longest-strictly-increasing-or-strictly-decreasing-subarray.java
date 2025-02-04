class Solution {
    public int longestMonotonicSubarray(int[] nums)
    {
     int maxlen=1, ic=1,dc=1;
     for(int i=1;i<nums.length;i++)
     {
        if(nums[i]>nums[i-1])
        {
            ic++;
            dc=1;
        }
        else if(nums[i]<nums[i-1])
        {
            dc++;
            ic=1;
        }
        else
        {
            dc=1;
            ic=1;
        }
        if (ic>maxlen) maxlen = ic;
        if (dc>maxlen) maxlen = dc;
        
     }
        return maxlen;
    }
}