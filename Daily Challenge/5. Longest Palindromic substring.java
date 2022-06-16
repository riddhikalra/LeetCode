class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int maxL=1;
        int start=0,low,high;
        for(int i=0;i<n;i++)
        {
            low=i-1;
            high=i+1;
            while(high < n && s.charAt(high)== s.charAt(i))
                high++;
            
            while(low>=0 && s.charAt(low) == s.charAt(i))
                low--;
            
            while (low >= 0 && high < n && s.charAt(low) == s.charAt(high) ){
                  low--;
                high++;
        }
       
            int len=high-low-1;
            if(maxL<len)
            {
                maxL=len;
                start=low+1;
            }
        
    }
        
        String sub= s.substring(start,start+maxL);
        return sub;
}
}