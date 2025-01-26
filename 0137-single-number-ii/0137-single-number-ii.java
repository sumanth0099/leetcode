import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums); // Sorting the array
        int n = nums.length;
        
        // Check if the first element is the unique one
        if (n == 1 || nums[0] != nums[1]) {
            return nums[0];
        }
        
        // Traverse the array and find the unique element
        for (int i = 1; i < n - 1; i++) {
            if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        
        // If the last element is the unique one
        return nums[n - 1];
    }
}
