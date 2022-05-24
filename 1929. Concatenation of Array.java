class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int arr[] = new int[n];
        int c=n+n;
        int res[] = new int[c] ;
        for(int i=0;i<n;i++)
        {
            arr[i]=nums[i];
        }
        
        for(int i=0;i<n;i++)
        {
            res[i]=nums[i];
        }
        for(int i=0;i<n;i++)
        {
            res[n+i]=arr[i];
        }
       
        return res;
    }
}