class Solution {
    public int maxProduct(String[] words) {
        int product =0;
       int n=words.length;
        int[] state=new int[n];
        for(int i=0;i<n;i++)
        {
            state[i]=getState(words[i]);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if((state[i] & state[j])==0)
                     if(words[i].length() * words[j].length() > product)
                     {
                         product = words[i].length() * words[j].length();
                     } 
            }
        }
        return product;
        
    }
    
    public int getState(String str) {
        int state=0;
        for( char c : str.toCharArray())
        {
            int index= c -'a';
            state |= 1<<(index);
        }
        return state;
    }
}