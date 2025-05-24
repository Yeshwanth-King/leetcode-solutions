class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        int res = 0;
        for(int num: nums){
            res = res ^ num;
        }
        return res;
    }
}