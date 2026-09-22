class Solution {
    public int maxProfit(int[] prices) {
        int MAX = Integer.MIN_VALUE;
        int MIN = prices[0];
        for(int i=1;i<prices.length;i++){
            MAX = Math.max(MAX,prices[i]-MIN);
            MIN = Math.min(MIN,prices[i]);
        }
        return MAX>=0?MAX:0;
    }
}