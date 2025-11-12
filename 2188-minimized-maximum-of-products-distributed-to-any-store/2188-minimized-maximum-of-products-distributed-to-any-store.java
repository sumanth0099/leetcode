class Solution {
        public  static boolean CheckMe(int n,int v,int q[]){
        int count = 0;
        for(int i:q)
        {
            if(i%v==0)
                count+=i/v;
            else
                count+=(i/v)+1;  
        }
        return count<=n;
    }
    public int minimizedMaximum(int n, int[] quant) {
         int right = 0;
        for(int i:quant)
        right=Math.max(i, right);
        int left=1;
        int min = 0;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(CheckMe(n, mid, quant)){
                if(min==0)
                min=mid;
                else
                min=Math.min(min, mid);
                right=mid-1;
            }
            else
            left=mid+1;
        }
        return min;
    }
}