class Solution {
    int res=0;
    public int sumNumbers(TreeNode root) {
        res=0;
         sumNumbers(root,0);
        return res;
    }
    public void sumNumbers(TreeNode root, int ans) {
        
        if(root==null)
        {
            return;
        }
        
        if(root.left==null && root.right==null)
        {
            ans=ans*10+root.val;
            res+=ans;
            return;
        }
        sumNumbers(root.left , ans*10 + root.val);
        sumNumbers(root.right , ans*10 + root.val);
    }
}