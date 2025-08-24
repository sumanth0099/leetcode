import java.util.Hashtable;
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Hashtable<Integer,Boolean>table= new Hashtable<>();
			long  sum=0;
			long max=0;
			int front=0;
			for(int i=0;i<nums.length;i++)
			{
				if(!table.containsKey(nums[i]))
				{
				sum+=nums[i];
				table.put(nums[i], true);
				}
				else{
					while(table.containsKey(nums[i])){
						table.remove(nums[front]);
						sum-=nums[front];
						front++;
					}
					table.put(nums[i], true);
					sum+=nums[i];
				}
				if(table.size()==k)
				{
					max=Math.max(sum, max);
					table.remove(nums[front]);
					sum-=nums[front];
					front++;
				}
			}
            return max;
    }
}