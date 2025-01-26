import java.util.List;

class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int num = nums.get(i);
            ans[i] = -1; // Default to -1 if no valid ans[i] is found

            // Iterate over possible values of ans[i]
            for (int candidate = 0; candidate < num; candidate++) {
                if ((candidate | (candidate + 1)) == num) {
                    ans[i] = candidate;
                    break; // Stop as soon as we find the smallest candidate
                }
            }
        }

        return ans;
    }
}
