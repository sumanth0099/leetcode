class Solution {
    public void rotate(int[][] matrix) {
        int arr[][] =new int[matrix.length][matrix.length];
        for(int i=0,m=0;(i<arr.length);i++,m++)
        {
            for(int j=arr.length-1,n=0;(j>=0&&n<arr.length);n++,j--)
            arr[m][n]=matrix[j][i];
        }
        for(int i=0;i<matrix.length;i++)
            matrix[i]=arr[i];
    }
}