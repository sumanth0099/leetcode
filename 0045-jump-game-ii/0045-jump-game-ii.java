class Solution {
    public static int maxFinder(int start, int end, int nums[]) {
        int max = nums[start];
        int index = start;
        for (; start <= end && start < nums.length; start++) { 
            if (max < nums[start] + start) { 
                max = nums[start] + start;
                index = start;
            }
        }
        return index;
    }

    public int jump(int[] nums) {
        if (nums.length <= 1) return 0;
        
        int jumps = 0;
        int currentEnd = 0;
        int nextEnd = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            nextEnd = Math.max(nextEnd, i + nums[i]); 
            
            if (i == currentEnd) { 
                jumps++;         
                currentEnd = nextEnd;
                
                if (currentEnd >= nums.length - 1) break; 
            }
        }

        return jumps;
    }
}
