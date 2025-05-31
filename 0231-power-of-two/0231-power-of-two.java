class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 1 || n == 2) return true;
        if(n == 0 || n < 0) return false;
        while(n != 0 ){
            int bit = n & 1;
            if(bit == 1 && n > 1) return false;
            n = n >> 1;
        }
        return true;
    }
}