import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        Hashtable<Character,Integer>table1= new Hashtable<>();
        Hashtable<Character,Integer>table2 = new Hashtable<>();
        for(char ch:s.toCharArray())
        {
            int value = table1.getOrDefault(ch,0);
            table1.put(ch,value+1);
        }
        for(char ch:t.toCharArray())
        {
            int value = table2.getOrDefault(ch,0);
            table2.put(ch,value+1);
        }
        for(int i=0;i<s.length();i++)
        {
            if(!table1.get(s.charAt(i)).equals(table2.getOrDefault(s.charAt(i),-1)))
            return false;
            if(!table1.getOrDefault(t.charAt(i),-1).equals(table2.get(t.charAt(i))))
            return false;
        }
        return true;
    }
}