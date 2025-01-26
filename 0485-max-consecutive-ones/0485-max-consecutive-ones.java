class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        List<Integer>v = new ArrayList<>();
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
             if(nums[i]==0)
             {
                if(max<v.size())
                max=v.size();
                v.clear();
             }
             else
             v.add(nums[i]);
        }
        if(max<v.size())
                max=v.size();
        return max;
    }
}