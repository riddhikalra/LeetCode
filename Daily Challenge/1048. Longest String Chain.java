class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a,b) -> a.length()-b.length());
        
        int ans=0;
        Map<String,Integer> memo = new HashMap<>();
        
        for(String w:words)
        {
            memo.put(w,1);
            
            for(int i=0;i<w.length();i++)
            {
                StringBuilder curr=new StringBuilder(w);
                String next=curr.deleteCharAt(i).toString();
                
                if(memo.containsKey(next))
                {
                    memo.put(w, Math.max(memo.get(w), memo.get(next)+1));
                }
            }
            
            ans=Math.max(ans,memo.get(w));
        }
        return ans;
        
    }
}