// Path Sum problem by using DFS approach.
/*

Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

Note: A leaf is a node with no children.

Example:

Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \    / \
7    2  5   1
Return:

[
   [5,4,11,2],
   [5,8,4,5]
]

*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// I will be using DFS approach in order to solve thhis probelm.
// Steps involved are as follows:-
// 1. Create a res array of LinkedList and create a current list
// 2. Use DFS approach in order to recursively traverse the tree and check if current sum=reqd sum.
// IF yes, add the current_path to res path
// Return the res path.

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        List<Integer> curRes = new LinkedList<Integer>();
        
        //Call the DFS function to calculate the paths.
        findDFS(root,sum,res,curRes);
        
        return res;
        
    }
    
    // Impelmentation of DFS function
    public void findDFS(TreeNode root, int sum, List<List<Integer>> res, List<Integer> cur)
    {
        if(root == null)
            return;
        
        cur.add(new Integer(root.val));
        if(root.left == null && root.right == null && sum == root.val)
        {
            //cur.add(root.val);
            res.add(new LinkedList(cur));
            //Make sure you remiove the last visited node and return from here
            cur.remove(cur.size()-1);
            return;
        }
        else
        {
            // Else you need to traverse the left and right subtrees.
            findDFS(root.left,sum-root.val, res, cur);
            findDFS(root.right, sum - root.val, res, cur);
        }
        
        // Once the end is reached make sure to remove the last visited node and return from here.
        cur.remove(cur.size()-1);
        //return;
        
        
    }
}
