class Solution {
    boolean contains(int arr[], int a) {
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i])
                return true;
        }
        return false;
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        int arr1[] = (nums1.length < nums2.length) ? (nums1) : (nums2);
        int arr2[] = (nums1.length > nums2.length) ? (nums1) : (nums2);
        Set<Integer> intersectionSet = new HashSet<>();  // Using a set to avoid duplicates
        
        for (int i = 0; i < arr1.length; i++) {
            if (contains(arr2, arr1[i])) {
                intersectionSet.add(arr1[i]);  // Add only unique common elements
            }
        }

        // Convert the set to an array
        if(nums1.length==1 && nums2.length==nums1.length)
        {
            int size=0;
            if(nums1[0]==nums2[0])
            size++;
            int[] result = new int[size];
            if(size!=0)
            result[0]=nums1[0];
            return result;
        }
        int[] result = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            result[index++] = num;
        }

        return result;
    }
}
