class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] char_counts = new int[26];
        for(int iter = 0; iter < s.length(); iter++)
        {
            char_counts[s.charAt(iter) - 'a']++;
            char_counts[t.charAt(iter) - 'a']--;
        }
        for(int iter = 0; iter < 26; iter++)
        {
            if(char_counts[iter] != 0)
            {
                return false;
            }
        }
        return true;
    }
}