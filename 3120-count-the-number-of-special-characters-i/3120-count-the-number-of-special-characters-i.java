class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character,Boolean>table1 = new HashMap<>();
        HashMap<Character,Boolean>table2 = new HashMap<>();
        for(char ch:word.toCharArray())
        {
            if(ch>='a' && ch<='z')
            table1.put(ch,true);
            else
            table2.put(ch,true);
        }
        int count=0;
        for(char ch:table2.keySet())
        {
            char lower = (char)(ch + ('a' - 'A'));
            if(table1.containsKey(lower))
            count++;
        }
        return count;
    }
}