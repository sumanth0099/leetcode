class Solution {
     public static void NextTwoFinder(Set<List<Integer>>set,List<List<Integer>>list,int nums[],int left,int target , int a,int b)
    {
        left++;
        int right=nums.length-1;
        List<Integer>l= new ArrayList<>();
        l.add(a);
        l.add(b);
        while(left<right)
        {
        long sum=(long)nums[left]+nums[right]+(a+b);
           if(sum>target)
           right--;
           else if(sum<target)
           left++;
           else if(sum==target){
            l.add(nums[left]);
            l.add(nums[right]);
            if(!set.contains(l) && l.size()==4)
            list.add(new ArrayList<>(l));
            set.add(new ArrayList<>(l));
            l.remove(3);
            l.remove(2);
           left++;
           right--;
           }
           else
           {
            while(nums[left]==nums[left+1] && (left+1)<nums.length)
               left++;
               left++;
               while(nums[right-1]==nums[right] && (right-1)>=0)
               right--;
               right--;
           }
        }
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
     Set<List<Integer>>set = new HashSet<>();
     List<List<Integer>>list = new ArrayList<>();
    for(int i=0;i<nums.length;i++)
    {
        for(int j=i+1;j<nums.length-1;j++)
            NextTwoFinder(set, list, nums,j, target,nums[i],nums[j]);
    }
    return list;
    }
}