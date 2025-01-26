class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int second = -1;
        int[] arr = new int[2]; 
        
        for (int i=0;i<nums.length;i++) {
            if (nums[i] == target && first == -1) {
                first = i; 
            }
            if (first != -1 && nums[i] == target) {
                second = i; 
            }
        }
        
        if (first == -1) {
            arr[0] = -1;
            arr[1] = -1; 
        } 
            arr[0] = first;
            arr[1] = second != -1 ? second : first; 
        
        
        return arr;
    }
}
