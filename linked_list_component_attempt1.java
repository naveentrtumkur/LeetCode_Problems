//Vague attempt 1

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
        while(head!=null && !set.isEmpty())
        {
            // If list's element is present in set, increment the counter.
            if(set.contains(head.val))
            {
                if(count == 0)
                    count++;
                set.remove(head.val);
            }
            else
                count++;
            head = head.next;
            //Else do-nothing.
            
        }
        
        return count;
    }
}
