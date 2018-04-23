// RECURSIVE SOLUTION TO SOLVE THIS PROBLEM.
//if node==1 or subtree conatins 1 then do nothing
// else prune that node.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode pruneTree(TreeNode root) {
        
        return updatedTree(root)?root:null;
        
        
        
    }
    
    public boolean updatedTree(TreeNode node)
    {
        if(node == null)
            return false;
        
        boolean x1 = updatedTree(node.left);
        boolean x2 = updatedTree(node.right);
        if(!x1) //left subtree as null
            node.left = null;
        if(!x2) //rigth subtree as null
            node.right = null;
        
        return node.val == 1 || x1 || x2;
    }
}
