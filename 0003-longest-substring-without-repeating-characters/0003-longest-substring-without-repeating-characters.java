class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            int j = i;
            String str = "";
            
            while (j < s.length()) {
                char currentChar = s.charAt(j);
                if (!str.contains("" + currentChar)) {
                    str += currentChar;  // Add the character to the substring
                } else {
                    max = Math.max(max, str.length());  // Update max if needed
                    break;  // Exit the inner loop on first duplicate
                }
                j++;
            }

            // Check after the inner loop for the case when we reach the end without duplicates
            max = Math.max(max, str.length());
        }
        
        return max;
    }
}
