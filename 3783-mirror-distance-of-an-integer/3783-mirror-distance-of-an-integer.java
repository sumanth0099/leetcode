class Solution {
    public int mirrorDistance(int n) {
        String str = ""+n;
        String reversed = new StringBuilder(str).reverse().toString();
        int a = Integer.parseInt(reversed);
        return Math.abs(n-a);
    }
}