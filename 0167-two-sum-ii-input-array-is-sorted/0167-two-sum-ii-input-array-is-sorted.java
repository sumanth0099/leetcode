class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int solution[] = new int[2];
        while(left<right)
        {
            int sum=(numbers[left]+numbers[right]);
            if(sum==target)
            {
                solution[0]=left+1;
                solution[1]=right+1;
                return solution;
            }
            else if(sum>target)
            right--;
            else if(sum<target)
            left++;
        }
        return solution;
    }
}