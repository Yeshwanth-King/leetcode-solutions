class Solution {
    public int missingNumber(int[] nums) {
        int targetSum;
        int n = nums.length;
        targetSum = (n * (n + 1)) / 2;
        int currSum = 0;
        for(int numsIter = 0; numsIter < n; numsIter++)
        {
            currSum += nums[numsIter];
        }
        return targetSum - currSum;
    }
}