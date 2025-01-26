class Solution {
    public List<String> stringSequence(String target) {
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        char lastChar = 'a';  // Start typing with 'a'
        
        for (int i = 0; i < target.length(); i++) {
            char targetChar = target.charAt(i);
            
            // Press Key 1 to append 'a' and then increment to the target character
            current.append('a');
            result.add(current.toString());
            
            // Use Key 2 to match the target character
            while (lastChar != targetChar) {
                lastChar = (char) (lastChar == 'z' ? 'a' : lastChar + 1);
                current.setCharAt(current.length() - 1, lastChar);
                result.add(current.toString());
            }
            
            // After matching the current character, reset `lastChar`
            lastChar = 'a';
        }
        
        return result;
    }
}
