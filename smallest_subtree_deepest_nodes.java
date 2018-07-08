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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        //Store a global variable as parent...
        TreeNode parent = root;
        if(root == null)
            return root;
        //Use a queue to store the elements to be BFS traversed.
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) //Traverse till the queue is not empty...
        {
            int qlen = queue.size();
            // Store list of list of all elemenst in a level.
            // If child elements aren't there, then store null
            for(int i=0;i<qlen;i++)
            {
                
            }
        }
        
        //After calculating list of list, backtrack from deepest node to find least common ancestor.
    }
}
