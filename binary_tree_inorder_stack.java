//Binary tree inorder traversal using Java

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// Solution using Iterative Approach (Method-1 Using Stacks.)
class Solution {
    
    public List<Integer> inorderTraversal(TreeNode root) {
    //create a list that stores the values to be returned.
    List<Integer> list = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    TreeNode temp;
    while(root!=null || !stack.isEmpty())
    {
        while(root!=null)
        {
            stack.push(root);
            root=root.left;
        }
            temp = stack.pop();
            list.add(temp.val);
            
            root=temp.right;
                
         }
       return list;
    }
}
