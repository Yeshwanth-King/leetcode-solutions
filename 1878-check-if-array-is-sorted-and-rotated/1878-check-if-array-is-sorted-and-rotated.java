class Solution {
    public static boolean isValid(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public boolean check(int[] nums) {
        int n = nums.length; // 5
        int res[] = new int[n];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                int ind = (i + j) % n;
                res[ind] = nums[i];
            }

            if(isValid(res)){
                return true;
            }
        }
        return false;
    }
}