/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode cur = head;
        if(head == null || head.next == null)
            return head;
        
        ListNode prev = new ListNode(-1); // Fake node created
        prev.next = head;
        ListNode pHead = prev;
        while(cur!=null)
        {
            while(cur.next!=null && cur.val == cur.next.val)
                cur = cur.next;
            
            if(prev.next == cur)
            {
                //If no duplicate, change th eprev pointer.
                prev = prev.next;
            }
            else
            {
                // If there are duplicates found, prev.next would point to cur.next node.
                prev.next = cur.next;
            }
            
            //Increment th ecurrent pointer.
            cur = cur.next;
        }
        
        return pHead.next;
        
        
    }
}
