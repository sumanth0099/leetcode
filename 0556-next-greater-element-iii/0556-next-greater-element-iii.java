class Solution {

    public int nextGreaterElement(int n) {

        String number = n+"";

        char array[] = number.toCharArray();

        int i=-1;

        for(int index = array.length-1;index>0;index--)
        {
            if(array[index]>array[index-1])
            {
                i = index-1;
                break;
            }
        }

        if(i<0)
            return -1;

        for(int j=array.length-1;j>i && j>=0;j--)
        {
            if(array[j]>array[i])
            {
                char temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                break;
            }
        }

        // reversing part added here
        int left = i + 1;
        int right = array.length - 1;

        while(left < right)
        {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
        try{
        int result = Integer.parseInt(new String(array));
        return result;
        }
        catch(Exception e)
        {
            return -1;
        }
    }
}