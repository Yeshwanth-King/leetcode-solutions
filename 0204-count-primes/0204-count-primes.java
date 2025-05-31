class Solution {
    public int countPrimes(int n) {
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes,true);
        int count = 0;
        for(int i = 2; i < n; i++){
            if(primes[i]){
                count++;
                for(int j = 2 * i; j < n; j += i){
                    primes[j] = false;
                }
            }
        }
        return count;
    }
}