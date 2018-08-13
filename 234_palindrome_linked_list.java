/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/*****
Approach-1: Use a stack to push all the elements onto the stack.
Start from the first again and compare every element to TOS till n/2.
In the first traversal length would have been calculated.

Time: O(n) exactly two passes throiugh the list and space: O(n)
****/

/***
Improved O(n) approach and space:O(1)
- Find the length of the List. Reverse the list till half.
- Move the pointer back to start. Compare every node from start to every node after mid.
- If they are same return Palindrome else return not a palindrome.
*****/


class Solution {
    public boolean isPalindrome(ListNode head) {
         if(head == null) { //If the head is null you can return true.
            return true;
        }
        
        //Pointers to check palindrome
        ListNode p1 = head; //This is a slow pointer
        ListNode p2 = head; //This is a fast pointer.
        ListNode p3 = p1.next;
        ListNode pre = p1;
        
        //find mid pointer, and reverse head half part
        while(p2.next != null && p2.next.next != null) {
            p2 = p2.next.next;
            pre = p1;
            p1 = p3;
            p3 = p3.next;
            p1.next = pre;
        }

        //If there are odd number of elements, need left move p1 one step
        if(p2.next == null) {
            p1 = p1.next;
        }
        
        //compare from mid to head/tail
        while(p3 != null) {
            if(p1.val != p3.val) {
                return false;
            }
            p1 = p1.next;
            p3 = p3.next;
        }
        return true;
        
    }
}
