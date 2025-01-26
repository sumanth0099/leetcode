class Solution {
    public int find(char arr[],int start)
    {
       int index=-1;
       int value = arr[start];
        char max = arr[start];
        for(;start<arr.length;start++)
        {
            if(max<=arr[start])
            {
                index=start;
                max=arr[start];
            }
        }
        if(value==max)
        return -1;
        return index;
    }
    public int maximumSwap(int num) {
        String string = Integer.toString(num);
        int lessOne=0;
        char[] charArray = string.toCharArray();
        int index=-1;
        for(int i=0;index==-1 && i<charArray.length;i++){
            index=find(charArray,i);
            lessOne=i;
        }
            if(index!=-1){
                char temp = charArray[lessOne];
        charArray[lessOne]=charArray[index];
        charArray[index]=temp;
            }
     string = new String(charArray);
     num=Integer.parseInt(string);
     return num;
    }
}