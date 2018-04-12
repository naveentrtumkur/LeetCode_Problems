//Add two numbers from MSB to LSB without reversing the nos.

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
        int len1 = length(l1), len2 = length(l2);
        //System.out.println("Beginning");
        if(len1 > len2)
        {
            while(len1!=len2)
            {
                l2=prepend(l2,0);
                len2++;
                //System.out.println("$$$1");
            }
        }
        else if(len1 < len2)
        {
            while(len1!=len2)
            {
                //System.out.println("$$$2");
                l1=prepend(l1,0);
                len1++;
            }
        }
        //else
        //{
            //do nothing
        //}
        
        //System.out.println("@@@@@6");
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[2];
        while(l1!=null && l2!=null)
        {
            //System.out.println("###1");
            int sum = l1.val + l2.val;
            int carry = 0;
            if(sum>9)
            {
                carry = sum/10;
                sum = sum%10;
                
                //arr[0] = 
                stack.push(sum);
                stack.push(carry);
                 System.out.println("sum inside="+sum);
                System.out.println("carry="+carry);
            }
            //System.out.println("sum="+sum);
            else
            stack.push(sum);
            l1 = l1.next;
            l2 = l2.next;
        }
        //System.out.println("###2");
        
        int temp = stack.pop();
        System.out.println(temp);
        
        ListNode cur = new ListNode(temp);
        while(!stack.isEmpty())
        {
           // System.out.println("###3");
           // ListNode temp = new ListNode(stack.pop().val);
            int temp1 = stack.pop();
            System.out.println(temp1);
            cur = prepend(cur,temp1);
        }
        
        return cur;
    }
    public ListNode prepend(ListNode head, int val)
    {
        ListNode newnode = new ListNode(val);
        newnode.next = head;
        head = newnode;
        return head;
    }
    
    public int length(ListNode head)
    {
        int count=0;
        while(head!=null)
        {
            count++;
            head = head.next;
        }
        
        return count;
        
    }
}
