class Solution {
    public String removeOuterParentheses(String input) {
        StringBuilder result = new StringBuilder();
        int depth = 0;

        for (char ch : input.toCharArray()) {
            if (ch == '(') {
                if (depth > 0) result.append(ch);
                depth++;
            } else {
                depth--;
                if (depth > 0) result.append(ch);
            }
        }

        return result.toString();
    }
}
