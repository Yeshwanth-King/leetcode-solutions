class Solution {
    public int maxRotateFunction(int[] nums) {
        int sum = 0;
        int total = 0;
        for(int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
            total += (nums[i] * i);
        }
        int [] swm = new int[nums.length];

        for(int i = 0; i < swm.length; i++)
        {
            swm[i] = sum - nums[i];
        }
        // for(int i = 0; i < swm.length; i++)
        // {
        //     // swm[i] = sum - nums[i];
        // System.out.print(swm[i] +" ");
        // }
        // System.out.println();
        // System.out.println(total);

        int maxSum = Integer.MIN_VALUE;
        maxSum = Math.max(maxSum, total);
        for(int i = nums.length - 1; i >= 0; i--)
        {
            total = (total - (nums[i] * (nums.length - 1))) + swm[i];
            maxSum = Math.max(maxSum, total);
        }
        return maxSum;
    }
}