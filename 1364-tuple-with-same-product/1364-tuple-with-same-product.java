class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                map.put(product, map.getOrDefault(product, 0) + 1);
            }
        }

        int count = 0;
        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (freq > 1) {
                count += ((freq - 1) * freq / 2) * 8;
            }
        }

        return count;
    }
}
