import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c); 
            max = Math.max(max, set.size());
        }

        return max;
    }
}
