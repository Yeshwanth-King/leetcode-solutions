class Solution {
    public int trap(int[] heights) {
        int highest = 0;
		int length = heights.length;
		int rm[] = new int[length];
		int lm[] = new int[length];
		for(int iter = length - 1; iter >= 0; iter--)
		{
			if(heights[iter] >= highest)
				highest	 = heights[iter];
			rm[iter] = highest;
		}
		highest = 0;
		for(int iter = 0; iter < length; iter++)
		{
			if(heights[iter] >= highest)
				highest = heights[iter];
			lm[iter] = highest;
		}

		int res = 0;
		int min;

		for(int iter = 0; iter < length; iter++)
		{
			min = lm[iter]  < rm[iter] ? lm[iter] : rm[iter];
			System.out.println(min - heights[iter]);
			res += min - heights[iter];
		}
        return res;
    }
}