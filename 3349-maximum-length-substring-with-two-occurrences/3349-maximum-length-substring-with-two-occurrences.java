class Solution {
    public int maximumLengthSubstring(String str) {
        int freq[] = new int[26];
			StringBuilder solution = new StringBuilder();
			int max=0;
			for(int i=0;i<str.length();i++)
			{
				if(freq[str.charAt(i)-'a'-0]>=2)
				{
				while(freq[str.charAt(i)-'a'-0]>=2)
				{
					freq[solution.charAt(0)-'a'-0]--;
					solution.deleteCharAt(0);
				}
				}
				solution.append(str.charAt(i));
				freq[str.charAt(i)-'a'-0]++;
				max = Math.max(max, solution.length());
			}
            return max;
    }
}