/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
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

// Solution using recursive call to construct mid and left,right subtree.
// Time complexity : O(nlogn)
// Space complexity : O(logn)
// Binary search approach to solve this particular problem.


class Solution {
    private ListNode node;
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null)
            return null;
        int size = 0;
        ListNode cur = head;
        node = head;        
        while(cur!=null)
        {
            cur = cur.next;
            size++;
        }
        return toBSTSorted(0, size-1);
    }
    
    //Always we will find mid node insert it, construct left/right subtree and then proceed.
    public TreeNode toBSTSorted(int low, int high)
    {
        //This is the base condition which needs to be checked.
        if(low>high)
            return null;
        
        int mid = low+((high - low)/2);
        
        TreeNode left = toBSTSorted(low,mid-1);
        
        TreeNode treenode = new TreeNode(node.val);
        treenode.left = left;
        
        node = node.next;
        
        TreeNode right = toBSTSorted(mid+1,high);
        treenode.right = right;
        
        return treenode; // return the constructed treenode so far.
        
    }
}


