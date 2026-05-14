import java.util.*;
class Solution {
        public static List<List<Integer>>solution = new ArrayList<>();
    public static void PrintSubSet(int nums[],ArrayList<Integer>l,int start){
         solution.add(new ArrayList<>(l));
        for(int i=start;i<nums.length;i++)
        {
            if(i>start && nums[i]==nums[i-1])
            continue;
            l.add(nums[i]);
            PrintSubSet(nums, l, i+1);
            l.remove(l.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        solution.clear();
        Arrays.sort(nums);
        ArrayList<Integer>l = new ArrayList<>();
        PrintSubSet(nums, l, 0);
        return solution;  
    }
}