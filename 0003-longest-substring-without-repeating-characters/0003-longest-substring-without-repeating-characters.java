class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        if(s == " ") return 1;
        int max = 1;
		for(int i = 0; i < s.length(); i++)
		{
			boolean [] visited = new boolean[256];
			int count = 0;
			for(int j = i; j < s.length(); j++)
			{
				if(visited[s.charAt(j)] == true)
				{
					break;
				}
				visited[s.charAt(j)] = true;
				count++;
				// System.out.printf("%s %d\n",str.substring(i,j + 1), count);
			}
			max = Math.max(max, count);
			
		}
		System.out.println(max);
		return max;
    }
}