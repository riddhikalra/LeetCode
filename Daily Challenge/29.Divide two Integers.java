class Solution {
    public int divide(int dividend, int divisor) {
        
        //checking the sign
        boolean neg=false;
        if((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0) )
            neg=true;
        
       //solving after removing the sign 
        long newdividend=Math.abs((long) dividend);
        long newdivisor=Math.abs((long) divisor);
        long res=0;
        
        while(newdividend >= newdivisor)
        {
            long temp=newdivisor;
            long q=1;
            while(temp<=newdividend)
            {
                temp<<=1;
                q<<=1;
            } 
            res += q >> 1;
            newdividend -= temp >> 1;
        }
        
        return  neg ? (int) ~res + 1 : res > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) res;
    }
}