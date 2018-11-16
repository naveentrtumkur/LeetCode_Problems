/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// Approach #1: Traverse to the end of the list and increment the digit by one.
// Optimzation Approach #2: Use two pointers. Everytime you increment first pointer, increment second pointer by two.
// Converges in O(n/2)..

// This probelm cannot be approached as I told above.
// So reverse the list, add 1 and reverse again ---> Not efficient!!!

// How can you make it better ????
// Either use recursion or Use a Stack.
// Recursively change the digits and pass it.
// EX : Think of 9999 +1 = 10000

// O(n) space and O(n) time complecity solution.
class Solution {
    public ListNode plusOne(ListNode head) {
        if(head == null) //If it's a nulll, simply return that
            return head;
        
        Stack<ListNode> st = new Stack<>();
        ListNode dummy = head;//, prev = null;
        while(dummy!=null) //Find teh last node in the list..
        {
            st.push(dummy);
            //prev = dummy;
            dummy = dummy.next;
        }
        
        while(!st.isEmpty())
        {
            ListNode curr = st.pop();
            curr.val+=1;
            if(curr.val < 10)
                return head; //No more change required.
            else
                curr.val = 0; //Set curr position to 0, we will add one to right bit. A Carry added.
        }
        
        //If controll came here, there needs to be '1' added to MSB.
        ListNode MSB = new ListNode(1);
        MSB.next = head;
        return MSB;
    }
}
