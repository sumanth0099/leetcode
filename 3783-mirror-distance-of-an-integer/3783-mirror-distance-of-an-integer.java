class Solution {
    public int mirrorDistance(int n) {
        int rev = 0;
        int b = n;

        while (b > 0) {
            int digit = b % 10;
            rev = rev * 10 + digit;
            b = b / 10;
        }

        return Math.abs(n - rev);
    }
}