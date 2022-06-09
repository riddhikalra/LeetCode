class Solution {
    public int[] twoSum(int[] numbers, int target) {
          
        int i=0,j=numbers.length-1;
        //int arr[]=new int[2];
        
           while(i<j) 
           {
               if(numbers[i] + numbers[j] == target)
                {
                   return new int[] { i + 1, j + 1 };
                }
               else if(numbers[i] + numbers[j] < target)
               {
                   i++;
               }
               else
                   j--;
        }
        return new int[2];
        
        
    }
}
