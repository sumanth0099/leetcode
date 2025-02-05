class Solution {
    public int search(int[] nums, int target) {
        if(Arrays.binarySearch(nums,target)>=0)
        return Arrays.binarySearch(nums,target);
        return -1;
    }
}