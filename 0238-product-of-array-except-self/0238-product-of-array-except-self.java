class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zCount = 0;
        int woZero = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zCount++;
            } else {
                woZero *= nums[i];
            }
        }

        int[] newArray = new int[nums.length];

        if (zCount >= 2) {
            return newArray;
        }

        if (zCount == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    newArray[i] = woZero;
                } else {
                    newArray[i] = 0;
                }
            }
            return newArray;
        }

        for (int i = 0; i < nums.length; i++) {
            newArray[i] = woZero / nums[i];
        }

        return newArray;
    }
}