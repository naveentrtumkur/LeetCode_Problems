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
    public int pathSum(TreeNode root, int sum) {
        // If root is null return 0;
        if(root == null)
            return 0;
        
        //Calculate the number of sum paths available from cur, left node and right node.
        int cursum = interpath(root,sum) + pathSum(root.left,sum) + pathSum(root.right,sum);
        return cursum;
    }
    
    public int interpath(TreeNode root, int sum)
    {
        //If the root is null return 0;
        if(root == null)
            return 0;
        
        int istarget = 0;
        
        if(sum == root.val)
            istarget = 1;
        
        //Recursively call the subtrees
        return istarget + interpath(root.left, sum - root.val) + interpath(root.right, sum - root.val);
    }
    
}
