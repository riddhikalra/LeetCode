class Solution {
    public int removePalindromeSub(String s) {
        if(s.charAt(0)==' ')
            return 0;
        if(palindrome(s))
            return 1;
        
        return 2;
        
    }
    public boolean palindrome(String s)
    {
        int start=0;
        int end=s.length()-1;
        
        while(end>start)
        {
            if(s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }
}