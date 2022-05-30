class Solution {
    public int mySqrt(int x) {
        if(x<=1)
            return x;
        return searchit(x);
    }
    public static int searchit(int x)
    {
        int l=1,r=x/2,mid,res=0;
        long temp;
        
        while(l<=r)
        {
            mid=(l +(r-l)/2);
            temp=(long)mid * (long)mid;
            
            if(temp==x)
                return mid;
            
            if(temp<x)
            {
                res=mid;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return res;
    }
}
