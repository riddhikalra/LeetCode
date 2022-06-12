class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int res=0;
           for(int j=0;j<endTime.length;j++)
            {
                if(endTime[j] >= queryTime && startTime[j] <= queryTime)
                    res++;
            }
        
        return res;
        
    }
}