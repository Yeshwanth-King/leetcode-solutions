class Solution {
    public void sortColors(int[] arr) {
        int i = 0, j = arr.length - 1, k = 0;
        while (k <= j) {
            if (arr[k] == 1) {
                k++;
            }
            else if (arr[k] == 0) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                i++;
                k++;
            }
            else if (arr[k] == 2) {
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                j--;
            }
        }
    }
}