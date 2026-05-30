class Solution {
    private static boolean isDigit(char digit)
	{
		return digit >= '0' && digit <= '9';
	}
    public String decodeString(String input) {
        Stack<Integer> count = new Stack<>();
		Stack<String> alpha = new Stack<>();
		
		int inpIter;
		String numStr = "";
		String newStr = "";
		int times = 0;
		String backToStack = "";
		for(inpIter = 0; inpIter < input.length(); inpIter++)
		{
			char ch = input.charAt(inpIter);
			if(isDigit(ch))
			{
				numStr = numStr + ch;
			}
			else if (ch == ']')
			{
				while(!alpha.peek().equals("["))
				{
					newStr =  alpha.pop() + newStr;
				}
				alpha.pop();
				times = count.pop();
				backToStack = "";
				while(times >0)
				{
					backToStack += newStr;
					times--;
				}
				newStr = "";
				alpha.push(backToStack);
			}
			else
			{
				if(ch == '[')
				{
					int digit = Integer.parseInt(numStr);
					count.push(digit);
					numStr = "";
				}
				alpha.push("" + ch);
			}
		}
		String output = "";
		while(!alpha.isEmpty()) output = alpha.pop() + output;
        return output;
    }
}