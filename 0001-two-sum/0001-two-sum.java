class Solution {
    public int[] twoSum(int[] nums, int target) {
        int p[] = new int[2];
     for(int i=0;i<nums.length;i++)
     {
        int left = i+1;
        int right = nums.length-1;
        while(left<=right)
        {
            if((nums[i]+nums[left])==target)
            {
                p[0] = i;
                p[1]=left;
                return p;
            }
           else if((nums[i]+nums[right])==target)
            {
                p[0] = i;
                p[1]=right;
                return p;
            }
            else if(left!=right && (nums[left]+nums[right])==target)
            {
                p[0] = left;
                p[1]=right;
                return p;
            }
            left++;
            right--;
        }
     }   
     return p;
    }
}