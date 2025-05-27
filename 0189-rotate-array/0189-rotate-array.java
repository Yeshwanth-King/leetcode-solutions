class Solution {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int res[] = new int[n];
        for (int i = 0; i < n; i++) {
            int ind = (i + k) % n;
            res[ind] = nums[i];
        }
        for (int i = 0; i < res.length; i++) {
            nums[i] = res[i];
        }
    }
}