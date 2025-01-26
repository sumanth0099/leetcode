class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        boolean[] dp = new boolean[n];
        dp[n-1]=true;
        for(int i = n-2;i>=0;i--){
            for(int j = 1;i+j<n&&j<=nums[i];j++){
                if(dp[i+j]== true){
                    dp[i]=true;
                    continue;
                }
                
            }
        }
        if(dp[0]==true) return true;
        else return false;
    }
}