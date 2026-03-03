class Solution {
    Set<List<Integer>>fullset = new HashSet<>();
    List<Integer>l = new ArrayList<>();
    void helper(int arr[],int start){
        fullset.add(new ArrayList<>(l));
        for(int i = start;i<arr.length;i++)
        {
            l.add(arr[i]);
            helper(arr,i+1);
            l.remove(l.size()-1);
        }
    }   
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        helper(nums,0);
         List<List<Integer>>fulllist = new ArrayList<>(fullset);
         return fulllist;
    }
}