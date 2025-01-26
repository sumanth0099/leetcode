class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1)
        return nums[0];
        int element=0;
        int pre=0;
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                count++;
            }
            if(pre<count)
            {
                pre=count;
                element=nums[i];
            }
        }
        return element;
    }
}