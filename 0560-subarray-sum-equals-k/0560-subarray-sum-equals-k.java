class Solution {
    public int subarraySum(int[] arr, int k) {
        int prefix[]=new int[arr.length];
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            prefix[i]=sum;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(prefix[i]==k)
            count++;
            for(int j=0;j<i;j++)
            {
                if((prefix[i]-prefix[j])==k)
                count++;
            }
        }
        return count;
    }
}