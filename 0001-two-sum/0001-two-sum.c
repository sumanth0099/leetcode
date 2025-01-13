#include <stdlib.h>

int* twoSum(int* nums, int numSize, int target, int* returnSize) {
    *returnSize = 2;  // The size of the result array is 2.
    int* result = (int*)malloc(2 * sizeof(int));  // Allocate memory for the result array.

    for (int i = 0; i < numSize; i++) {
        for (int j = i + 1; j < numSize; j++) {  // j should start from i+1 to avoid adding the same element.
            if (nums[i] + nums[j] == target) {
                result[0] = i;
                result[1] = j;
                return result;
            }
        }
    }

    // If no solution is found (this assumes there is always a solution based on the problem statement).
    *returnSize = 0;
    return NULL;
}