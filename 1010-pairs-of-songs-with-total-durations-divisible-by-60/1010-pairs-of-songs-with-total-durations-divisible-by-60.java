class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int freq[] = new int[500];
        int count = 0;
        for(int i=0;i<time.length;i++)
        {
            int rem = time[i]%60;
            int req = (60-time[i]%60)%60;
            count+=freq[req];
            freq[rem]++;
        }
        return count;
    }
}