//Binary tree inorder solution using trivial recursiomn technique.

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
    //create a list that stores the values to be returned.
        List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        
        
        //Base case condition.
        if(root == null)
            return list;
        
        //if(root.left!=null)
            inorderTraversal(root.left);
        list.add(root.val);
        //if(root.right!=null)
            inorderTraversal(root.right);
        
        return list;
    }
}
