//Method-2 to split linkedList without any extra space.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
// Solving using a space efficient solution.
// Do not use extra list, instead split th ecurrent list into parts.
/* 
My solution to this problem can be split into following steps:-
1) find the length of linked list i.e len.
2) Given k, split length is len/k. if(len%k !=0) temp = len%k starting from first part we will assign extra element and decrement temp value
3) return the final calculated list.

*/

// First of all clearly understand that teh return type is an Array of Linkedlist.

class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        
        int len =0;
        ListNode cur = root;
        
    while(cur!=null)
    {
        len++;
        cur = cur.next;
    }
        int n = len/k;
        //System.out.println("n="+n);
        int rem = len%k;
        //System.out.println("rem="+rem);
        
        // create a listNode array that stores the answers.
        ListNode[] ans = new ListNode[k];
        ListNode temp = root;
        // split the list into k-parts.
        for(int i=0; i<k; i++)
        {
            ListNode head = temp;
            //int value = (n + (i<rem?1:0));
            //System.out.println("Evaluation="+value);
            for(int j=0; j<(n + (i<rem?1:0))-1; j++)
            {
                if(temp!=null)
                temp = temp.next;
                //prev = temp;
                
            }
            if(temp!=null)
                {
               ListNode prev = temp;
               temp = temp.next;
               prev.next = null;
                }
            //System.out.println(prev.next.val);
            ans[i] = head;
        }
        
        //return the final calculated answer.
        return ans;
        
    }
}
