class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int len = heights.length - 1;
        PriorityQueue<Integer> p = new PriorityQueue<>();
        
        for (int i = 0; i < len; i++) 
        {
            int diff = heights[i+1] - heights[i];
            if (diff > 0) 
            {
                if (ladders> 0)
                {
                    p.add(diff);
                    ladders--;
                } 
                else if (p.size() > 0 && diff > p.peek())
                {
                    p.add(diff);
                    bricks -= p.poll();
                } 
                else 
                    bricks -= diff;
                
                if (bricks < 0)
                    return i;
            }
        }
        return len;
    }