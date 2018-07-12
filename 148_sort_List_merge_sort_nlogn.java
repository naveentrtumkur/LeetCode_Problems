/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// Kind of mergesort solution.
// O(nlogn) Solution.

// You can also solve this using extra space like Array by sorting the Array and constructing the new List.
// If asked to do in-place with efficient time, the below approach would be the best.

 class Solution {
  
   ListNode sortList(ListNode head) {
    if (head == null || head.next == null) //If head is null or just head, then simply return.
      return head;
        
    // step 1. cut the list to two halves
    ListNode prev = null, slow = head, fast = head;
    
    while (fast != null && fast.next != null) {
      prev = slow;
      slow = slow.next;
      fast = fast.next.next;
    }
    
    //Prev is the middle elemnt list.
    prev.next = null;
    
    // step 2. sort each half
    ListNode l1 = sortList(head); //Sort from head till middle.
    ListNode l2 = sortList(slow); //sort from the middle till end.
    
    // step 3. merge l1 and l2
    return merge(l1, l2); //Merge the result and return the result...
  }
  
  //Function to merge the lists given as the input.
  ListNode merge(ListNode l1, ListNode l2) {
    ListNode l = new ListNode(0), p = l;
    
    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        p.next = l1;
        l1 = l1.next;
      } else {
        p.next = l2;
        l2 = l2.next;
      }
      p = p.next;
    }
    
    if (l1 != null)
      p.next = l1;
    
    if (l2 != null)
      p.next = l2;
    
    return l.next;
  }

}
