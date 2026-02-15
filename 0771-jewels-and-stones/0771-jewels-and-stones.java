import java.util.*;
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Hashtable<Character,Integer>table = new Hashtable<>();
        for(char ch:stones.toCharArray())
        {
            int value = table.getOrDefault(ch,0);
            table.put(ch,value+1);
        }
        int count=0;
        for(char ch:jewels.toCharArray())
        count+=table.getOrDefault(ch,0);
        return count;
    }
}