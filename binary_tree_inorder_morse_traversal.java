// SOlution by using morse traversal.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// Solution using Morse traversal i.e Iterative Approach (Method-2 Using Morse traversal)
class Solution {
    
    public List<Integer> inorderTraversal(TreeNode root) {
    //create a list that stores the values to be returned.
    List<Integer> list = new ArrayList<>();
    TreeNode cur=root, pre;
    while(cur!=null)
    {
        if(cur.left==null)
        {
            list.add(cur.val);
            //traverse right.
            cur = cur.right;
        }
        else
        {
            //store pre with cur.left value.
            //TreeNode temp = cur.left;
            pre = cur.left;
            
            while(pre.right!=null)
            {
                pre = pre.right;
            }
            
            pre.right = cur;
            TreeNode temp = cur;
            cur = cur.left;
            //to avoid loops.
            temp.left = null;
            
            
        }
    }
       return list;
    }
}
