class Solution {
    public int maxSubArray(int[] nums) {
       int n=nums.length;
        if(nums==null || n==0)
            return 0;
     
        return divide(nums,0,n-1);
        
        
        
    }
    public static int divide(int[] nums,int start,int end)
    {
        if(start>end)
            return Integer.MIN_VALUE;
        
       int mid=start+ (end-start)/2;
     int left=  divide(nums,start,mid-1);
     int right=  divide(nums,mid+1,end);
        
     
        int leftMaxSum = 0;
        int sum = 0;
      // left surfix maxSum start from index mid - 1 to l
      for (int i = mid - 1; i >= start; i--) {
        sum += nums[i];
        leftMaxSum = Math.max(leftMaxSum, sum);
      }
      int rightMaxSum = 0;
      sum = 0;
      // right prefix maxSum start from index mid + 1 to r
      for (int i = mid + 1; i <= end; i++) {
        sum += nums[i];
        rightMaxSum = Math.max(sum, rightMaxSum);
      }
      // max(left, right, crossSum)
      return Math.max(leftMaxSum + rightMaxSum + nums[mid], Math.max(left, right));
    }
}
