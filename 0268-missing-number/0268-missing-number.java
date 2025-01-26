class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer>s1 = new TreeSet<>();
        for(int i=0;i<nums.length;i++)
          s1.add(nums[i]);
        for(int i=0;i<nums.length;i++)
        {
            if(!s1.contains(i))
            return i;
        }
        return nums.length;
    }
}