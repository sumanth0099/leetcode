import java.util.*;
class Solution {
    public int findDuplicate(int[] nums) {
        Hashtable<Integer,Integer>table = new Hashtable<>();
        for(int a:nums){
            int value = table.getOrDefault(a,0);
            if(value!=0)
            return a;
            else
            table.put(a,1);
        }
        return -1;
    }
}