class Solution {
    public void moveZeroes(int[] arr) {
         for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            continue;
            int j=0;
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[j]==0)
                continue;
                else
                break;
            }
            if(j>=arr.length)
            continue;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
}