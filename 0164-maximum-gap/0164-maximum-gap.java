class Solution {
    public int maximumGap(int[] arr) {
        if(arr.length<2)
        return 0;
        Arrays.sort(arr);
        int max=0;
        for(int i=1;i<arr.length;i++)
        {
            if((arr[i]-arr[i-1])>max)
            max=arr[i]-arr[i-1];
        }
        return max;
    }
}