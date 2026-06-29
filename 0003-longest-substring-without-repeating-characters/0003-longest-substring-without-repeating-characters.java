class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        int max = 0;
		int l = 0; 
		int r = 0;
		int hash[] = new int[256];
		for(int i = 0; i < 256; i++)
			hash[i] = -1;
		
		while(r < s.length())
		{
			if(hash[s.charAt(r)] != -1)
			{
				if(hash[s.charAt(r)] >= l)
				{
					l = hash[s.charAt(r)] + 1;
				}
			}
			max = Math.max(max, r - l + 1);
			hash[s.charAt(r)] = r;
			r++;
		}
		return max;
    }
}