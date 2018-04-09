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
    public List<Integer> largestValues(TreeNode root) {
        // List to store the max value at each row.
        List<Integer> list = new ArrayList<>();
        
        //check the base condition
        if(root == null)
            return list;
        
        //Add the root node to Queue and then start iterating
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int count = q.size();
            int max = Integer.MIN_VALUE;
            for(int i=0; i<count;i++)
            {
                TreeNode temp = q.poll();
                if(max< temp.val)
                    max = temp.val;
                
                if(temp.left!=null)
                    q.add(temp.left);
                
                if(temp.right!=null)
                    q.add(temp.right);
            }
            //Add the max value at that row to teh list.
            list.add(max);
        }
        
        //Return back the list
        return list;
    }
}
