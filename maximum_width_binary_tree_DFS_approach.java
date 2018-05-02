/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// I will be using DFS approach to solve this probelm.
// Assign level & position so that nodes can be identified. 
// Find the maximum width by caclulating end_node - start_node + 1

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        return binaryDFS(root, 0, 1, new ArrayList<Integer>());
    }
    
    //position indicates the position of node in tree. List start stores starting position or left most node position at every level.
    public int binaryDFS(TreeNode root, int level, int position, List<Integer> start)
    {
        //If node is null just return.
        if(root == null)
            return 0;
        
        if(level == start.size())
            start.add(position);
        
        int cur = position - start.get(level) +1;
        
        //If its next leftnode, postion would be adjusted to position*2+1 
        int leftPos = binaryDFS(root.left, level+1, position*2 +1,start );
        
        //If its next rigthnode, position would be adjusted to poistion*2+2
        int rightPos = binaryDFS(root.right, level+1, position*2+2, start);
        
        //cur is max depth of cur level, lefPos and rigthPos are compared to check if next level contains only one node. i.e only one left or right child node.
        return Math.max(cur, Math.max(leftPos,rightPos));
        
    }
}
