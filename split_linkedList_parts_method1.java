/* Problem Statement:

Given a (singly) linked list with head node root, write a function to split the linked list into k consecutive linked list "parts".

The length of each part should be as equal as possible: no two parts should have a size differing by more than 1. This may lead to some parts being null.

The parts should be in order of occurrence in the input list, and parts occurring earlier should always have a size greater than or equal parts occurring later.

Return a List of ListNode's representing the linked list parts that are formed.

Examples 1->2->3->4, k = 5 // 5 equal parts [ [1], [2], [3], [4], null ]
Example 1:
Input:  root = [1, 2, 3], k = 5 Output: [[1],[2],[3],[],[]]

*/




/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

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
        System.out.println("n="+n);
        int rem = len%k;
        System.out.println("rem="+rem);
        
        // create a listNode array that stores the answers.
        ListNode[] ans = new ListNode[k];
        ListNode temp = root;
        // split the list into k-parts.
        for(int i=0; i<k; i++)
        {
            ListNode head = new ListNode(0), prev = head;
            //int value = (n + (i<rem?1:0));
            //System.out.println("Evaluation="+value);
            for(int j=0; j<(n + (i<rem?1:0)); j++)
            {
                head.next = new ListNode(temp.val);
                //System.out.println("temp="+temp.val);
                //System.out.println("head="+head.next.val);
                temp = temp.next;
                head = head.next;
            }
            //System.out.println(prev.next.val);
            ans[i] = prev.next;
        }
        
        //return the final calculated answer.
        return ans;
        
    }
}
