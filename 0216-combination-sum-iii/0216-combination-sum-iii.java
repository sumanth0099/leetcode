import java.util.*;
class Solution {
       public static List<List<Integer>>solution = new ArrayList<>();
    public static void getComSum(int nums[],ArrayList<Integer>l,int r,int k,int start)
    {
        if(r<0 || l.size()>k)
        return;
        else if(r==0 && l.size()==k)
        solution.add(new ArrayList<>(l));
        for(int i=start;i<nums.length;i++)
        {
            l.add(nums[i]);
            getComSum(nums, l, r-nums[i], k, i+1);
            l.remove(l.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        solution.clear();
        ArrayList<Integer>l = new ArrayList<>();
        int nums[]={1,2,3,4,5,6,7,8,9};
        getComSum(nums, l, n, k, 0);
        return solution;
    }
}