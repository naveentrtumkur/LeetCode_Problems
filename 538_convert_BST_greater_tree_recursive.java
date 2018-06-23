/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//Recursive solution: Approach is reverse inorder traversal to find the solution.
// Recurse right -> calculate global sum -> recurse left and return the calculated result. 
class Solution {
    int curSum = 0;
    //recursively call the left and right subtrees.
    public TreeNode convertBST(TreeNode root) {
        if(root!=null)
        {
            convertBST(root.right);
            curSum += root.val;
            // Set the current root.val to curSum.
            root.val = curSum;
            convertBST(root.left);
         }
        return root;
    }
}
