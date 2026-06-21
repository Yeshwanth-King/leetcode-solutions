class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] res = new int[nums.length];
        int n = nums.length;
        int suffix = 1;
        res[0] = 1;
        for(int iter = 1; iter < n; iter++)
        {
            res[iter]  =  res[iter - 1] * nums[iter - 1];
        }
        for(int iter = n - 2; iter >= 0; iter--)
        {
            suffix *= nums[iter + 1];
            res[iter] *= suffix;
        }
        return res;
    }
}