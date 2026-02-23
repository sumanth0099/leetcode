class Solution {
        int count = 0;
    public void findSeqSumCount(int arr[],int k,int left,int right)
    {
        long[] power = new long[arr.length];
        power[0] = 1;
        for (int i = 1; i < arr.length; i++) 
            power[i] = (power[i - 1] * 2) % 1_000_000_007;
        while(left<=right)
        {
            if((arr[left]+arr[right])>k)
            right--;
            else
            {
                count+=power[(right-left)];
                count=count%1_000_000_007;
                left++;
            }
        }
    }
    public int numSubseq(int[] arr, int k) {
        Arrays.sort(arr);
        findSeqSumCount(arr, k, 0, arr.length-1);
        return count;
    }
}