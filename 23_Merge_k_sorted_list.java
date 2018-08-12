// Most efficient Priority Queuue Approach.
// Time: O(nlogn) for n elements it's n and each insertion and retrieval is logn.
// Space : O(n)

// Use a priority queue by implementing a comparator interface..

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0)
            return null; //nothing to compute.
        
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, new Comparator<ListNode>()
                                                            {
                                                                public int compare(ListNode l1, ListNode l2)
                                                                {
                                                                    if(l1.val < l2.val)
                                                                        return -1;
                                                                    else if(l1.val > l2.val)
                                                                        return 1;
                                                                    else
                                                                        return 0;
                                                                }
                                                            });
        
        ListNode dummy = new ListNode(0);// create a dummy node that will be useful.
        ListNode end = dummy;
        //Loop through all teh list and maintain the ascending order.
        for(ListNode node: lists)
        {
            if(node!=null)
            queue.add(node);
            
        }
        
        //pop the queue current smamll value, insert to dummy and procedd...
        while(!queue.isEmpty())
        {
            ListNode curr = queue.poll();
            end.next = curr;
            end = end.next;
            if(end.next!=null)
                queue.add(end.next); //add teh next element onto the queue
        }
        
        return dummy.next; //return the dummy.next value.
    }
}
