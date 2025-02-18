class Solution {
    public int singleNonDuplicate(int[] arr) {
         
        int left=0;
        int right=arr.length-1;
        while(left<right && left<arr.length)
        {   
            int mid = (left+right)/2;
           if(mid%2==0 && arr[mid]==arr[mid+1])
              left=mid+1;
           else if(mid%2!=0 && arr[mid]!=arr[mid+1])
           left=mid+1;
           else 
           right=mid;
        }
        return arr[left];
    }
}