class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] res = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int n = nums.length;
        prefix[0] = 1;
        for(int iter = 1; iter < n; iter++)
        {
            prefix[iter] = prefix[iter - 1] * nums[iter - 1];
        }
        suffix[n - 1] = 1;
        for(int iter = n - 2; iter >= 0; iter--)
        {
            suffix[iter] = suffix[iter + 1] * nums[iter + 1];
        }
        for(int iter = 0; iter < n; iter++)
        {
            res[iter] = prefix[iter] * suffix[iter];
        }
        return res;
    }
}