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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
       return help(inorder,postorder,postorder.length-1,0,inorder.length-1 ); //Call the helper node to conrstuct the tree in a recursive fashion...
    }
    public TreeNode help(int[] inorder,int[] postorder,int postStart, int inStart,int inEnd){
         if(inStart>inEnd||postStart<0){ //Base case
             return null;
         }
        TreeNode root= new TreeNode(postorder[postStart]); // construct a new TreeNode
        int rootIndex=0; // Init the rootIndex to 0.
        for(int i=inStart;i<=inEnd;i++){
            if(inorder[i]==root.val){
                rootIndex=i;
            }
        }
        root.right=help(inorder,postorder,postStart-1,rootIndex+1,inEnd); //Construct root->right
        root.left=help(inorder,postorder,postStart-(inEnd-(rootIndex))-1,inStart,rootIndex-1); //Construct root->left.
        return root;
    }

}
