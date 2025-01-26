class Solution 
{
    public List<String> letterCombinations(String digits)
     {
       if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        // Mapping of digits to letters
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> result = new ArrayList<>();
        String initial = "";
        bp(digits, initial, 0, map, result);
        return result; // Return the result list
    }

    private static void bp(String source, String initial, int size, Map<Character, String> map, List<String> result) {
        if (initial.length() == source.length()) {
            result.add(initial); // Add the current combination to the result
            return;
        }
        String present = map.get(source.charAt(size));
        for (int i = 0; i < present.length(); i++) {
            bp(source, initial + present.charAt(i), size + 1, map, result); // Append the letter and continue
        }
    }
}