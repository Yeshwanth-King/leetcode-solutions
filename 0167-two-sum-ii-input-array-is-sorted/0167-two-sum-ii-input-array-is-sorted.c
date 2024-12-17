/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* numbers, int numbersSize, int target, int* returnSize) {
    int *start = numbers;
    int *end = &numbers[numbersSize - 1];
    while(start <= end){
        if (*start + *end == target) {

        int *arr = (int *)malloc(2 * sizeof(int));

        arr[0] = start - numbers + 1; 
        arr[1] = end - numbers + 1; 
        *returnSize = 2;
        return arr;
        }
        
        if(*start + *end < target){
            start++;
        }
        if(*start + *end > target){
            end--;
        }
    }
    *returnSize = 0; // No solution found
    return NULL;
}
