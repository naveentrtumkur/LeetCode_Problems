/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// I Will use BFS approach to solve this problem.
// Helper class is used to store the position and level value.
// curlevel is stored and updated accordingly.
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        //create a queue to store the value.
        Queue<AnnotedNode> q = new LinkedList<>();
        
        q.add(new AnnotedNode(root, 0,0));
        int curDepth = 0, position =0, finAns = 0;
        while(!q.isEmpty())
        {
            AnnotedNode a = q.poll();
            if(a.node!=null)
            {
              q.add(new AnnotedNode(a.node.left, a.depth+1,a.pos*2));
              q.add(new AnnotedNode(a.node.right,a.depth+1,a.pos*2+1));      
              
            if(curDepth!=a.depth)
            {
                curDepth = a.depth;
                position = a.pos;
                
            }
                finAns = Math.max(finAns, a.pos - position +1);
            }
            
        }
        
            return finAns;
        }
    
}
 class AnnotedNode
    {
        TreeNode node;
        int depth;
        int pos;
        AnnotedNode(TreeNode t, int d, int p)
        {
             node = t;
             depth = d;
             pos = p;
        }
    }

