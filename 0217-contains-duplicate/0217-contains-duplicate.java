class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>v1 = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        v1.add(nums[i]);
        if(v1.size()!=nums.length)
        return true;
        return false;
}
}