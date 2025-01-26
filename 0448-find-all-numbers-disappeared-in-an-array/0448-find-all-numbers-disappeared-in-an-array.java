class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int max = nums.length; 
        int[] freq = new int[max + 1];
        for (int i = 0; i < nums.length; i++) 
            freq[nums[i]]++;
        
        List<Integer> v1 = new ArrayList<>();
        for (int i = 1; i <= max; i++) { 
            if (freq[i] == 0) {
                v1.add(i);
            }
        }

        return v1;
    }
}
