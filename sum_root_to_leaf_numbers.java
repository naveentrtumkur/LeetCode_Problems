/*

Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

An example is the root-to-leaf path 1->2->3 which represents the number 123.

Find the total sum of all root-to-leaf numbers.

Note: A leaf is a node with no children.

Example:

Input: [1,2,3]
    1
   / \
  2   3
Output: 25
Explanation:
The root-to-leaf path 1->2 represents the number 12.
The root-to-leaf path 1->3 represents the number 13.
Therefore, sum = 12 + 13 = 25.

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

// My approach is to use a DFS based approach 
class Solution {
    int sum_tot = 0;
    public int sumNumbers(TreeNode root) {
        
       // List<Integer> res = new LinkedList<>();
        int total =0; int curSum = 0;
        dfsTraverse(root, curSum, total);
        // Return the calculated total value of the sum.
        return sum_tot;
    }
    
    public void dfsTraverse(TreeNode root, int curSum, int total)
    {
        if(root == null)
            return;
        
        curSum = curSum*10 + root.val;
        
        // If this is a child node then add the sum to total. 
        if(root.left == null && root.right == null)
        {
            total += curSum;
            sum_tot += total;
            //System.out.println("Total-"+total);
            curSum = (curSum - root.val)/10;
            return;
        }
        else
        {
            // Traverse left node
            dfsTraverse(root.left,curSum,total);
            
            //Traverse rigth node
            dfsTraverse(root.right, curSum, total);
            
        }
        
        //Make sure to remove the last value.
        curSum = (curSum - root.val)/10;
    }
        
        
    }
