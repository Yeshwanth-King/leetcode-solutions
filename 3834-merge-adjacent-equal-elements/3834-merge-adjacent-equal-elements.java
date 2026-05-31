class Solution {
    public List<Long> mergeAdjacent(int[] nums_int) {
      long[] nums = new long[nums_int.length];
      for(int iter = 0; iter < nums_int.length; iter++)
      {
        nums[iter] = (long) nums_int[iter];
      }  
      List<Long> result = new ArrayList();
		int iter;
		int left, right;
		left = 0;
		right = 1;
		int inIter;
		while(right < nums.length)
		{
			if(nums[left] == nums[right])
			{
				nums[left] *= 2;
				nums[right] = -1L;
				right++;
				inIter = 1;
				while(left - inIter >= 0)
				{
					if(nums[left] == nums[left - inIter] && !(nums[left] == -1L))
					{
						nums[left - inIter] *= 2;
						nums[left] = -1L;
						left = left - inIter;
                		inIter = 0;

					}
                    else if ( nums[left - inIter] != -1L )
						break;
					inIter ++;
				}
			}
			else
			{
				left = right;
				right = right + 1;
			}
		}
        for(iter = 0; iter < nums.length; iter++)
		{
			if(nums[iter] != -1L)
				result.add(nums[iter]);
		}
		return result;  
    }
}