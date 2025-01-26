class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        if (isNegative) {
            x = -x;
        }

        String str = Integer.toString(x);
        String reversedStr = new StringBuilder(str).reverse().toString();
        
        try {
            int reversed = Integer.parseInt(reversedStr);
            return isNegative ? -reversed : reversed;
        } catch (NumberFormatException e) {
            // If parsing the reversed number causes an overflow, return 0
            return 0;
        }
    }
}
