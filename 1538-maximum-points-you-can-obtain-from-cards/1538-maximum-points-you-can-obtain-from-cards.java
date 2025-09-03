class Solution {
    public int maxScore(int[] c, int k) {
        int sum=0;
        for(int i=0;i<k;i++)
        sum+=c[i];
        int max=sum;
        for(int i=0;i<k;i++)
        {
            sum-=c[k-i-1];
            sum+=c[c.length-i-1];
            max=Math.max(sum,max);
        }
        return max;
    }
}