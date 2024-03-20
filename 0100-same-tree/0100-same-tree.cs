/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public bool IsSameTree(TreeNode p, TreeNode q) {
        return isSame(p,q);
    }
    private bool isSame(TreeNode p, TreeNode q)
    {
        if(p==null && q==null)
            return true;
        if(p==null || q==null)
            return false;
        if(p.val != q.val)
            return false;
        return isSame(p.left,q.left) && isSame(p.right,q.right);
    }
}