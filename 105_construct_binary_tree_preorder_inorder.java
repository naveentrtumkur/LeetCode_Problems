/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


//The solution is to find preorder element in inorder array, fix that as root and recurse left subtree
// and right subtree to find appropriate solution.
// Time : O(nlogn)
// Space : O(n)

class Solution {
  public TreeNode buildTree(int[] preorder, int[] inorder) {
    return helper(0, 0, inorder.length - 1, preorder, inorder); //call the helper function
}

public TreeNode helper(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
    if (preStart > preorder.length - 1 || inStart > inEnd) { //base case to check..
        return null;
    }
    
    //construct the root node focusing on preorder node and recursively construct the subtree..
    TreeNode root = new TreeNode(preorder[preStart]);
    int inIndex = 0; // Index of current root in inorder
    for (int i = inStart; i <= inEnd; i++) {
        if (inorder[i] == root.val) {
            inIndex = i; //Find the inorder index from the inorder array
        }
    }
    
    //Find the left subtree
    root.left = helper(preStart + 1, inStart, inIndex - 1, preorder, inorder);
    
    //Find the right subtree
    root.right = helper(preStart + inIndex - inStart + 1, inIndex + 1, inEnd, preorder, inorder);
    return root; //return the root node.
}
}
