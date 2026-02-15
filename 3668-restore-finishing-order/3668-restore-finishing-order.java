class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
    int returnIngArray[] = new int[friends.length];
    int pointer=0;
    for(int i=0;i<order.length;i++)
    {
        int index = Arrays.binarySearch(friends,order[i]);
        if(index>=0)
        returnIngArray[pointer++]=friends[index];
    }
    return returnIngArray;
    }
}