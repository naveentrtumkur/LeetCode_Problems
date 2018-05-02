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
    public int countNodes(TreeNode root) {
        //Calculate the height of the left subtree
        int h = height(root);
        
        // If root.right == h-1, then it would be sum of root + left subtree and recursive right subtree. Same holds for left part
        return h <0 ? 0: height(root.right) == h-1? (1<< h) + countNodes(root.right): (1<< h-1) + countNodes(root.left);
        
    }
    
    // A method to calculate the height of a tree.
    public int height(TreeNode root)
    {
        return root == null?-1: 1+ height(root.left);
    }
}



