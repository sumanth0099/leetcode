class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int len = mountainArr.length();

        // Find the peak
        int left = 0;
        int right = len - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        int peak = left;

        // Search in ascending part
        int result = binarySearchAscending(
            mountainArr, target, 0, peak
        );

        if (result != -1) {
            return result;
        }

        // Search in descending part
        return binarySearchDescending(
            mountainArr, target, peak + 1, len - 1
        );
    }

    private int binarySearchAscending(
        MountainArray mountainArr,
        int target,
        int left,
        int right
    ) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int value = mountainArr.get(mid);

            if (value == target) {
                return mid;
            } else if (value < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    private int binarySearchDescending(
        MountainArray mountainArr,
        int target,
        int left,
        int right
    ) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int value = mountainArr.get(mid);

            if (value == target) {
                return mid;
            } else if (value < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}