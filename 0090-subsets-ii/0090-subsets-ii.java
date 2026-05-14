import java.util.*;
class Solution {
    public static HashMap<ArrayList<Integer>,Boolean>table = new HashMap<>();
    public static void PrintSubSub(int nums[],ArrayList<Integer>list,int start){
        table.put(new ArrayList<>(list),true);
        for(int i=start;i<nums.length;i++)
        {

            list.add(nums[i]);
            PrintSubSub(nums, list, i+1);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        table.clear();
        Arrays.sort(nums);
        ArrayList<Integer>l = new ArrayList<>();
        PrintSubSub(nums, l, 0);
        return new ArrayList<>(table.keySet());
    }
}