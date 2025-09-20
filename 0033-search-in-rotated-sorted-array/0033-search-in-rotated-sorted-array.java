class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[left])
                left = mid;
            else 
                right = mid;
        }

        int ans = Arrays.binarySearch(nums, 0, left + 1, target);
        if (ans >= 0) 
            return ans;
        ans = Arrays.binarySearch(nums, left + 1, nums.length, target);
        if (ans >= 0) 
		return ans;
		return -1;
    }
}