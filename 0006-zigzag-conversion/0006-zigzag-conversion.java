class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)
        {
            return s;
        }
        String res = "";
        int n = s.length();
        int steps = (n - 1) * 2;
        int iter;
        int incrementer;
        incrementer = (numRows - 1) * 2;
        for(iter = 0; iter < numRows; iter++)
        {
            for(int resIter = iter; resIter < n; resIter = resIter + incrementer)
            {
                res += s.charAt(resIter);
                if(iter > 0 && iter < numRows - 1 && resIter + incrementer - 2 * iter < n)
                {
                    res += s.charAt(resIter + incrementer - 2 * iter);
                }
            }
        }
        return res;
    }
}