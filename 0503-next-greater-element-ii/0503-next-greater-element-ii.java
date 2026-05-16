class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>stack = new Stack<>();
        HashMap<Integer,Integer>table = new HashMap<>();
        for(int i=nums.length-2;i>=0;i--)
        stack.add(nums[i]);
        for(int i=nums.length-1;i>=0;i--)
        {
            while(!stack.isEmpty())
            {
                int val = stack.peek();
                if(val>nums[i])
                {
                    table.put(i,val);
                    break;
                }
                stack.pop();
            }
            if(stack.isEmpty())
            table.put(i,-1);
            stack.push(nums[i]);
    }
    for(int i=0;i<nums.length;i++)
    nums[i] = table.get(i);
    return nums;
}
}