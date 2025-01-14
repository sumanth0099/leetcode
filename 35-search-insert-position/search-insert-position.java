class Solution {
    public int searchInsert(int[] nums, int target) {
        boolean ans = true;
        for(int i=0;i<nums.length && ans==true;i++)
        {
            if(target==nums[i] || nums[i]>target)
            return i;
        }
        return nums.length;
    }
    
}