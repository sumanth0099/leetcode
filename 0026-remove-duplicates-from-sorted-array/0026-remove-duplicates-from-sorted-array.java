class Solution {
    public int removeDuplicates(int[] nums) {
        int min = nums[0];
        int k = 1;
        nums[0] = min; 
        for (int i = 1; i < nums.length; i++) {
            if (min < nums[i]) {
                nums[k++] = nums[i];
                min = nums[i];
            }
        }
        return k;
    }
}
