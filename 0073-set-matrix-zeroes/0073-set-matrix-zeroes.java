import java.util.*;
class Solution {
    public static void changeColum(int col, int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
             if(arr[i][col]!=-1)
            arr[i][col] = 0;
        }
    }

    public static void changeRow(int row, int arr[][]) {
        for (int i = 0; i < arr[row].length; i++) {
            if(arr[row][i]!=-1)
            arr[row][i] = 0;
        }
    }

    public void setZeroes(int[][] matrix) {
          Hashtable<Integer, Integer> table = new Hashtable<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) 
                    matrix[i][j] = -1; 
                else if(matrix[i][j]==-1){
                table.put(i,j);
                matrix[i][j]=-2;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j]=0;
                    Solution.changeColum(j, matrix); 
                    Solution.changeRow(i, matrix);  
                }
            }
        }
         for (Integer key : table.keySet()) {
            if(matrix[key][table.get(key)]!=0)
         matrix[key][table.get(key)]=-1;
         }
}
}