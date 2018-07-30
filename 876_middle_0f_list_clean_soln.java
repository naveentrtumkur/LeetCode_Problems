/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// This is a classic linkedlist problem to find the middle node.
// Use runner technique with a fast and slow pointer.
// For every move of slow, move the fast two moves.
// when fast reaches End of list, slow would be at the middle.
// Time Complexity: O(n) Space : O(1)
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null)
            return head;
        
        ListNode slow = head, fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
}
