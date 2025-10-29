class Solution {
    public boolean valid(int w[],int k , int d){
        int sum=0,count=1;
            for(int i=0;i<w.length;i++)
            {
                if(w[i]>k)
                return false;
                else if((sum+w[i])<=k)
                sum+=w[i];
                else
                {
                    count++;
                    sum=w[i];
                }
            }
            return count<=d;
    }
    public int shipWithinDays(int[] w, int d) {
        int maxNum = w[0];
        for(int i:w)
        maxNum=Math.max(i,maxNum);
        int left = maxNum;
        int right = maxNum*w.length;
        int minimumAns=0;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(!valid(w,mid,d))
            left=mid+1;
            else
            {
                if(minimumAns==0)
                minimumAns=mid;
                else
                minimumAns=Math.min(minimumAns,mid);
                right=mid-1;
            }
        }
        return minimumAns;
    }
}