class Solution {
    
    public boolean check(int[] nums) {
       int g = 0;
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] > nums[i + 1]) {
                g += 1;
            }
            i++;
        }
        if (nums[nums.length - 1] > nums[0]) {
            g += 1;
        }

        if(g == 1 || g == 0){
            return true;
        }else{
            return false;
        }
    }
}