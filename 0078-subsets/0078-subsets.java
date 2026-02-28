class Solution {
   public List<List<Integer>>flist = new ArrayList<>();
    public List<Integer>list = new ArrayList<>();
    void createBigList(int arr[],int start)
    {
        flist.add(new ArrayList<>(list));
        for(int i=start;i<arr.length;i++)
        {
            list.add(arr[i]);
            createBigList(arr,i+1);
            // list.removelast();
            list.remove(list.size() - 1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        createBigList(nums,0);
        return flist;
    }
}