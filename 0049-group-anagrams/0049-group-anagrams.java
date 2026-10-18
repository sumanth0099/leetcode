class Solution {
    public String findKey(String a)
    {
        char arr[] = a.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    } 
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>>map = new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            String key = findKey(strs[i]);
            ArrayList<String>list = map.getOrDefault(key,null);
            if(list==null)
            list = new ArrayList<>();
            list.add(strs[i]);
            map.put(key,new ArrayList<>(list));
        }
        List<List<String>>FinalResult = new ArrayList<>();
        for(List<String>value:map.values())
            FinalResult.add(value);
        return FinalResult;
    }
}