class Solution {
    public int find(int nums[],int t)
    {
          boolean ans=false;
        for(int i=0;i<nums.length;i++)
        {
          if(nums[i]==t)
            ans=true;
          if(ans && nums[i]>t)
          return nums[i];
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        arr[i]=find(nums2,nums1[i]);
        return arr;
    }
}