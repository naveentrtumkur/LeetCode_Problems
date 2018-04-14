/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        int count =0; // Counter to maintain the count of current node number we are traversing.
        
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);
        
        ListNode oddTraverse = odd, evenTraverse = even; //Pointers to odd list and even list.
        ListNode cur = head;
        while(cur!=null)
        {
            if((count+1)%2 != 0)
            {
                oddTraverse.next = new ListNode(cur.val);
                oddTraverse = oddTraverse.next;
            }
            else
            {
                evenTraverse.next = new ListNode(cur.val);
                evenTraverse = evenTraverse.next;
            }
            // Increment the current node to point to next node.
            
            cur = cur.next;
            count++;
        }
        
        //if (cur == null)
        oddTraverse.next = even.next;
        evenTraverse.next = null;
        
        // Return the odd.next value
        return odd.next;
    }
}
