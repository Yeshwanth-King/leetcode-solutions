class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || s.length() <= numRows)
        {
            return s;
        }
        String[] rows = new String[numRows];
        int row = 0;
        boolean goingDown = false;
        for(int iter = 0; iter < numRows; iter++)
        {
            rows[iter] = "";
        }
        for(int iter = 0; iter < s.length(); iter++)
        {
            rows[row] += s.charAt(iter);
            if(row == 0 || row == numRows - 1)
            {
                goingDown = !goingDown;
            }
            row += goingDown ? 1 : -1;
        }
        String result = "";
        for(int iter = 0; iter < numRows; iter++)
        {
            result += rows[iter];
        }
        return result;
    }
}