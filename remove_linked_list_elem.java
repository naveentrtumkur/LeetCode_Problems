/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
         if (head == null) return null; // Check if head is null
        ListNode cur = head; //pointer to head
        while (cur.next != null) {
        if (cur.next.val == val) 
            cur.next = cur.next.next; //Point cur node by skipping the nexct node
        else 
            cur = cur.next;
    }
    return head.val == val ? head.next : head; //Chec if we need to remove head, Else return teh head.
    }
}
