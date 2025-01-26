class Solution {
    public int removeElement(int[] nums, int val) {
        int c= 0,i; 
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[c] = nums[i];
                c++;
            }
        }
        return c;
    }
}