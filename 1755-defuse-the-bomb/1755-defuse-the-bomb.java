class Solution {
    public static int[] resolve(int code[],int start , int k)
	{
		int arr[] = new int[code.length];
		if(k==0)
		return  new int[code.length];
		int sum=0;
		int left = start;
		int right = left;
		while(right<start + k)
			sum+=code[right++];
		
		for(int i=0;i<code.length;i++)
		{
			arr[i]=sum;
			sum+=code[right++%code.length];
			sum-=code[left++%code.length];
		}
		return arr;
	}
    public int[] decrypt(int[] code, int k) {
         if(k>0)
			return Solution.resolve(code, 1, k);
			else if(k<0)
			 return Solution.resolve(code,code.length-(k*-1) , k*-1);
			else
			 return Solution.resolve(code, 1, k);
    }
}