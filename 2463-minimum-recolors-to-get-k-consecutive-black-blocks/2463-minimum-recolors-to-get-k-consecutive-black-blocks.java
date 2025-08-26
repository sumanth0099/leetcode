class Solution {
    public int minimumRecolors(String str, int k) {
        int count=0;
			for(int i=0;i<k;i++){
				if(str.charAt(i)=='W')
				count++;
			}
			int max = count;
			for(int i=k;i<str.length();i++)
			{
				if(str.charAt(i)=='W' && str.charAt(i-k)=='B')
				count++;
				else if(str.charAt(i)=='B' && str.charAt(i-k)=='W')
				count--;
				max = Math.min(max, count);
			}
            return max;
    }
}