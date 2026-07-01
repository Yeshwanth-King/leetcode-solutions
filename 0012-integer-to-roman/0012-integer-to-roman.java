class Solution {
    public String intToRoman(int num) {
        String roman[] = {
            "M","CM","D","CD",
            "C","XC","L","XL",
            "X","IX","V","IV","I"
        };
        int values[] = {
            1000,900,500,400,
            100,90,50,40,
            10,9,5,4,1
        };
        // String ans = "";
        StringBuilder ans = new StringBuilder();
        for(int iter = 0; iter < values.length;iter++)
        {
            while(num >= values[iter])
            {
                ans.append(roman[iter]);
                num -= values[iter];
            }
        }
        return ans.toString();
    }
}