class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0, k = 0;
        while(k < nums.length){
            if(nums[k] != 0){
                int temp = nums[i];
                nums[i++] = nums[k];
                nums[k] = temp;
            }
            k++;
        }
    }
}