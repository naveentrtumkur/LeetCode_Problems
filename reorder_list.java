/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        //If only one node or none, then return that only.
        if(head == null || head.next == null)
            return;
        
        // Reverse the second half of the list.
        ListNode n1 = head;
        ListNode n2 = head;
        while(n2.next!=null && n2.next.next!=null)
        {
            n1 = n1.next;
            n2 = n2.next.next;
        }
        
        ListNode mid = n1;
        ListNode midNext = n1.next;
        while(midNext.next!=null)
        {
            ListNode cur = midNext.next;
            midNext.next = cur.next;
            cur.next = mid.next;
            mid.next = cur;
        }
        
        // connect every element from beginnig to elemnt from second half.
        ListNode n3 = head;
        ListNode midHalf = mid.next;
        while(n3!=mid)
        {
            mid.next = midHalf.next;
            midHalf.next = n3.next;
            n3.next = midHalf;
            n3 = midHalf.next;
            midHalf = mid.next;
        }
        
       // return head;
    }
}
