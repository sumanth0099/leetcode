class Solution {
    boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public String longestPalindrome(String string) {
        String answer = "";
        for (int i = 0; i < string.length(); i++) {
            for (int j = i; j < string.length(); j++) {
                String temp = string.substring(i, j + 1);
                if (isPalindrome(temp)) {
                    if (answer.length() < temp.length()) {
                        answer = temp;
                    }
                }
            }
        }
        return answer;
    }
}
