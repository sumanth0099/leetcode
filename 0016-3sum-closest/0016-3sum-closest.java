class Solution 
{
    public int threeSumClosest(int[] nums, int target)
     {
    
         int sum=nums[0]+nums[1]+nums[2];
        int diff=Math.abs(sum-target);
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                     if(k==i || k==i+1)
                        continue;
                        int newSum = nums[i]+nums[j]+nums[k];
                        int newDifference = Math.abs(newSum-target);
                         if(newDifference<diff)
                        {
                            diff=newDifference;
                            sum=newSum;
                         }
                }
            }
        }
         return sum; 
    }
        
}