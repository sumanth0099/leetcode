class Solution {
    public int maxProduct(int[] nums) {
        int n=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            int p=1;
            for(int j=i;j<nums.length;j++)
            {
                p=p*nums[j];
                n = Math.max(n,p);
            }
        }
        return n;
    }
}