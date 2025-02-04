class Solution {
    public int maxAscendingSum(int[] nums) {
        int num=nums[0];
        int sum1=num;
        int sum=0;
        for(int i=1;i<nums.length;i++)
        {
             if(num<nums[i])
             {
                num=nums[i];
                sum1+=num;
             }
             else{
                num=nums[i];
                sum=Math.max(sum,sum1);
                sum1=num;
             }
        }
        sum=Math.max(sum,sum1);
        return sum;
    }
}