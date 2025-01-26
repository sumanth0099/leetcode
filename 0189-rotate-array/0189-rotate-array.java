class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k > n
        int index = n - k;
        int newArr[] = new int[n];
        int i = 0;
        
        // Copy last k elements to the start of newArr
        for (; i < n && index < n; i++)
            newArr[i] = nums[index++];
        
        // Copy the rest of the elements
        for (int j = 0; j < n - k; j++)
            newArr[i++] = nums[j];
        
        // Copy elements from newArr back to nums
        for (int j = 0; j < n; j++)
            nums[j] = newArr[j];
    }
}
