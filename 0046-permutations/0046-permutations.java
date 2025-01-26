class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> v1= new ArrayList<>();
        backtrack(nums,0,v1,result);
        return result;
    }
    private void backtrack(int nums[],int start,List<Integer> list, List<List<Integer>>  result) 
    {
        if(list.size() == nums.length)
        {
            result.add(new ArrayList<>(list));
        }
        if(list.size()>nums.length)
        {
            return;
        }
        
        for(int i=start;i<nums.length;i++)
        {
            if(list.contains(nums[i]))
            continue;
            list.add(nums[i]);
            backtrack(nums,0,list,result);
            list.remove(list.size()-1);
        }
    }
        
}