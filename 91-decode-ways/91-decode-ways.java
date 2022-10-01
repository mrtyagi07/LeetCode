class Solution {
    public int numDecodings(String s) {
        int ways1 = 1; // number of ways to decode substring [0, i-2]
        int ways2 = 1; // number of ways to decode substring [0, i-1]
        for(int i=0; i<s.length(); ++i)
        {
            char cur = s.charAt(i);
            char pre = i > 0 ? s.charAt(i-1) : '0';     
            int ways3 = 0; // number of ways to decode substring [0, i]
            if(cur=='0')  
            {
                if(pre=='1' || pre=='2') // Be decoded as 10 or 20
                {
                    ways3 = ways1;
                }else
                {
                    return 0; //Invalid string
                }
            }else
            {
                ways3 = ways2; // Be decoded as [1, 9]
                if(pre=='1' || (pre=='2' && cur<='6')) // Be decoded as [11, 19] [21, 26] 
                {
                    ways3 += ways1;
                }
            }
            
            //Move to next location
            ways1 = ways2;
            ways2 = ways3;
        }
        return ways2;
    }
}