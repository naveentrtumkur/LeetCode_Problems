/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// Approach using recursion.
// Divide the problem into different cases:-
/* 1. if left and right is null do nothing, (adding empty braces is redundant)
   2. If the left is null and right is non-null we have to insert empty braces for left child.
   3. If the right is null, recurse the left child.
   4. Else if both are non-null (recurse_LEFT)(recurse_right)
   
   Time: O(n)
   Space: O(n)
   */

class Solution {
    public String tree2str(TreeNode t) {
        
        if(t == null)
            return ""; //If t is null return empty string.
        if(t.left == null && t.right == null) // if the left and the right child is null.
            return t.val+""; //Only curr value and ntg else required.
        if(t.right == null) //Caase when the right child is null
            return t.val+"("+tree2str(t.left)+")";
        return t.val+"("+tree2str(t.left)+")"+"("+tree2str(t.right)+")"; //Else when both non-null
    }
}
