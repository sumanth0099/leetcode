class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] result = new int[n * 2];
        for (int i = 0; i < n; i++) 
            result[i] = nums[i];
        for (int i = 0; i < n; i++) 
            result[n + i] = nums[n - 1 - i];
        return result;
    }
}