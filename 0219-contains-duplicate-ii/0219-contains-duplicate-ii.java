class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int s = Math.abs(i-j);
                if(s>k)
                break;
                if(nums[i]==nums[j]){
                if(s<=k)
                return true;
                }
            }
        }
        return false;
    }
}