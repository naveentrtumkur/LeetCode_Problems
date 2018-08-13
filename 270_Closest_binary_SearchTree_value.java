/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//Closest value can be the one among following:
// Current root value or the subtree's root value.
// Recursive Solution to find the closest value....

class Solution {
    public int closestValue(TreeNode root, double target) {
        int curr = root.val; // Teh root would be current node.
    
        TreeNode sub_root =  (curr > target)? root.left:root.right;
        
        if(sub_root == null)
            return curr;
        
        int curr_subtree = closestValue(sub_root, target);
        
        //Find the closest among curr and curr_subtree and return the result,
        if(Math.abs(curr - target) < Math.abs(curr_subtree - target))
            return curr;
        else
            return curr_subtree;
    }
}
