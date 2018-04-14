//Solution by using two stacks

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// My solution is to use a stack and push teh elements on to stack.
// If element sum is greater than 10, then split the number and push it onto stack.
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        
        while(l1!=null)
        {
            s1.push(l1.val);
            l1 = l1.next;
        }
        
        while(l2!=null)
        {
            s2.push(l2.val);
            l2 = l2.next;
        }
        
        ListNode cur = new ListNode(0);
        int sum =0;
        while(!s1.isEmpty()||!s2.isEmpty())
        {
            if(!s1.isEmpty())
                sum+=s1.pop();
            if(!s2.isEmpty())
                sum+=s2.pop();
            
            ListNode temp = new ListNode(sum/10);
            cur.val = sum%10;
            temp.next = cur;
            cur = temp;
            sum = sum/10;
            
        }
        //check if the last carry is non-zero or not.
        return cur.val == 0?cur.next:cur;
    }
}
