class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count=0;
        Arrays.sort(g);
        for(int i=0;i<s.length;i++)
        {
          for(int j=g.length-1;j>=0;j--)
          {
            if(g[j]<0)
            continue;
            if(s[i]>=g[j])
            {
                g[j]=-1;
                count++;
                break;
            }
          }
        }
        return count;
    }
}