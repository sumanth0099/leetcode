class Solution {
     public boolean found = false;

    public boolean CompareMe(String a, String b){
        int x = a.length();
        int y = b.length();

        if(x > y)
            return false;
        else if(x == y)
        {
            found = a.equals(b);
            return found;
        }
        return a.equals(b.substring(0, x));
    }

    public void helper(char nums[][], String current, String input,
                        int isVisted[][], int row, int col)
    {
        if(found)
            return;

        if(((row<0 || row>=nums.length) || (col<0 || col>=nums[row].length)))
            return;

        if((isVisted[row][col]==1))
            return;

        if(!(CompareMe(current+nums[row][col], input)))
            return;

        isVisted[row][col]=1;

        if(!found){
            helper(nums,current+nums[row][col], input, isVisted, row, col+1); //right
            helper(nums, current+nums[row][col],input, isVisted, row+1, col); //down
            helper(nums, current+nums[row][col],input, isVisted, row, col-1); //left
            helper(nums, current+nums[row][col],input, isVisted, row-1, col); //top
        }

        isVisted[row][col]=0;
    }
        public boolean ChckMe(char[][] nums, String input)
    {
        found = false;

        int[][] visited = new int[nums.length][nums[0].length];

        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums[0].length; j++)
            {
                helper(nums, "", input, visited, i, j);

                if(found)
                    return true;
            }
        }

        return false;
    }
    public boolean exist(char[][] nums, String input) {
        return ChckMe(nums,input);
    }
}