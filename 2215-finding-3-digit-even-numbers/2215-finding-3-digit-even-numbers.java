import java.util.*;
class Solution {
    public int[] findEvenNumbers(int[] nums) {
                List<Integer>list = new ArrayList<>();
        Arrays.sort(nums);
        Hashtable<Integer,Boolean>table = new Hashtable<>();
        for(int i=0;i<nums.length;i++)
        {
            if((nums[i]==0))
            continue;
            for(int j=0;j<nums.length;j++)
            {
                if(i==j)
                continue;
                for(int k=0;k<nums.length;k++)
                {
                    if(((i==j) || (j==k) || (i==k)) || !(nums[k]%2==0))
                    continue;
                    int result = 100*nums[i]+10*nums[j]+nums[k];
                    if((table.isEmpty() || !table.containsKey(result)) && result>99)
                    {
                        list.add(result);
                        table.put(result, true);
                    }
                    }
                }
            }
            int newArray[] = new int[list.size()];
            int i=0;
            for(Integer e:list)
            newArray[i++]=e;
            return newArray;
    }      
}