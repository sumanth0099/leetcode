class Solution {
    Stack<Integer>stack = new Stack<>();
    HashMap<Integer,Integer>table = new HashMap<>();
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i=nums2.length-1;i>=0;i--)
        {
            while(!stack.isEmpty())
            {
                int val = stack.peek();
                if(val>nums2[i])
                {
                    table.put(nums2[i],val);
                    break;
                }
                stack.pop();
            }
            if(stack.isEmpty())
            table.put(nums2[i],-1);
            stack.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++)
        nums1[i]=table.get(nums1[i]);
        return nums1;
    }
}