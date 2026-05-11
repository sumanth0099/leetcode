import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer,Integer>table = new Hashtable<>();
        int p[] = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            // int diff = nums[i]-target;
         int   diff = target - nums[i];
            // d + t = n 
            if(table.containsKey(diff))
            {
                p[0]=table.get(diff);
                p[1]=i;
                break;
            }
            else
            table.put(nums[i],i);
        }
        return p;
    }
}