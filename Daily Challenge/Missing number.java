class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        Arrays.sort(nums);
        int i;  
        for( i=0;i< n;i++)
        {
            if(nums[i]!=i)
                break;
                
            
        }
       return i; 
    }
}