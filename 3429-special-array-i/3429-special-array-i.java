class Solution {
    public boolean isArraySpecial(int[] nums) {
        for(int i=0;i<nums.length-1;i++)
        {
           int a = nums[i];
           int b = nums[i+1];
           if((a%2==0 && b%2==0) ||(a%2!=0 && b%2!=0) )
           return false;
        }
        return true;
    }
}