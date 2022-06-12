class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n=nums.length;
        Set<Integer> arr=new HashSet<Integer>();
        int sum=0,left=0,right=0,res=0;
        while(right < n){
            int numNew = nums[right++]; 
            
            while(arr.contains(numNew)){
                int numOld = nums[left++]; 
                arr.remove(numOld);
                sum -= numOld;
            }
            arr.add(numNew);
            sum += numNew;
            res = Math.max(res, sum);
        }
        return res;
        
    }
}