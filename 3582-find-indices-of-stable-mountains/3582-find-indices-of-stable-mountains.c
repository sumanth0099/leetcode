int* stableMountains(int* height, int heightSize, int threshold, int* returnSize) {
    int* result = (int*)malloc((heightSize) * sizeof(int));
    int count = 0;
    for (int i = 1; i < heightSize; i++) {
        if (height[i - 1] > threshold) {
            result[count++] = i;
        }
    }
    *returnSize = count;
    result = (int*)realloc(result, count * sizeof(int));
    return result;
}
