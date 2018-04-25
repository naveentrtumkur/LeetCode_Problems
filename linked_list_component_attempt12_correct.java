/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// Solution is to push the elements of G function to a HashSet(Given teh condition that elements are unique)
// Traverse the linked list. For every non-existing element increment the counter.
class Solution {
    public int numComponents(ListNode head, int[] G) {
       
        //base case
        if(head == null)
            return 0;
        
        int count =0;
        // Declare the hashset to be used.
        Set<Integer> set = new HashSet<>();
        
        //Add every element on to the hashset.
        for(int i:G)
            set.add(i);
        //traverse through the list and find the number of parts existing.
        ListNode cur  = head;
        while(cur!=null)
        {
            // IF cur element is in set and set doesn't contain next val or next val is null, then increment counter
            if(set.contains(cur.val) && (cur.next == null || !set.contains(cur.next.val)))
                count++;
            cur = cur.next;
        }
        
        return count;
    }
}
