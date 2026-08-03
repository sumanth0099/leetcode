import java.util.*;

class Solution {

    String myKey(String str) {
        if (str.length() == 0) return "";

        StringBuilder key = new StringBuilder();
        key.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) > key.charAt(key.length() - 1)) {
                key.append(str.charAt(i));
            } else {
                int j = key.length() - 1;
                while (j >= 0 && str.charAt(i) <= key.charAt(j)) {
                    j--;
                }
                key.insert(j + 1, str.charAt(i));
            }
        }

        return key.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String str : strs) {
            String key = myKey(str);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}