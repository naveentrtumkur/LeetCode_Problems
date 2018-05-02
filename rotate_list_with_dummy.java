/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

//We need to be cautious while designing a solution to this problem.
// K-value can be larger than list length. Thi sshould be taken care.
// Following are steps used to solve this problem
// 1.Find th elength of the list.
// 2. Find the position which should be swapped to front.
// 3. Start swapping the elements from this position to front.

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // If head is null or head.next is null return.
        if(head == null || head.next == null)
            return head;
        
        // Create a dummy node just before head.
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        //Use two pointers to the dummy node.
        ListNode prev = dummy, cur = dummy;
        //len is the length of the list.
        int len =0;
        while(cur.next!=null)
        {
            len++;
            cur = cur.next;
        }
        
        for(int j=0;j< len - k%len;j++)
            prev = prev.next;
        
        // Now prev is in posiiton to be swapped to front.
        
        cur.next = dummy.next;
        dummy.next = prev.next;
        prev.next = null;
        
        return dummy.next;
        
        
        
    }
}
