/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// Approach using recursion.
// Divide the problem into different cases:-
/* 1. if left and right is null do nothing, (adding empty braces is redundant)
   2. If the left is null and right is non-null we have to insert empty braces for left child.
   3. If the right is null, recurse the left child.
   4. Else if both are non-null (recurse_LEFT)(recurse_right)
   
   Time: O(n)
   Space: O(n)
   */

 class Solution {
     String tree2str(TreeNode t) {
        if (t == null) //if the curr node is null retun empty string
            return "";
         
        Stack < TreeNode > stack = new Stack < > (); //create a stack
        stack.push(t); //push root
        Set < TreeNode > visited = new HashSet < > (); //a hashset to maintain visted nodes.
         
         
        StringBuilder s = new StringBuilder(); //stringbuilder to construct output string.
        while (!stack.isEmpty()) {
            t = stack.peek(); //this would be current node to be processed
            if (visited.contains(t)) { //if it's visited,just pop & close braces
                stack.pop();
                s.append(")");
            } else {
                visited.add(t); //add to visited list & add opening braces
                s.append("(" + t.val);
                if (t.left == null && t.right != null)
                    s.append("()"); //if left is null & right is non-null append '()'
                if (t.right != null)
                    stack.push(t.right); //push the right child
                if (t.left != null)
                    stack.push(t.left); //push the left child
            }
        }
        return s.substring(1, s.length() - 1); //finally return the answer
    }
}
