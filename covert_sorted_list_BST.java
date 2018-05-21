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

class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null)
            return null;
        return toBSTSorted(head, null);
    }
    
    //Always we will find mid node insert it, construct left/right subtree and then proceed.
    public TreeNode toBSTSorted(ListNode head, ListNode tail)
    {
        ListNode fast = head;
        ListNode slow = head;
        
        //Base condition to be checked.
        if(head == tail)
            return null;
        
        while(fast!=tail && fast.next!=tail)
        {
            fast = fast.next.next;
            slow = slow.next;
            
        }
        //Now slow would be the middle element in the list
        TreeNode tree_head = new TreeNode(slow.val);
        tree_head.left = toBSTSorted(head,slow);
        tree_head.right = toBSTSorted(slow.next,tail);
        return tree_head;
        
    }
}



