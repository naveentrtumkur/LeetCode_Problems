// approach -- Use two stacks.
// Step-1: push all teh elements in reverse order onto first stack.
// Step-2: pop first element and discard, pop second element onto second stack.
// Base case: If input is null or input is one element return that.
// else return when the number of element is just one.

class Solution {
         public int lastRemaining(int n) {
        // YOU CAN also come up with soln using two stacks.
        //Simpler soln if you observe the pattern properly.
        boolean left = true;
        int remaining = n;
        int step = 1;
        int head = 1;
        while (remaining > 1) {
            if (left || remaining % 2 ==1) {
                head = head + step;
            }
            remaining = remaining / 2;
            step = step * 2;
            left = !left;
        }
        return head;
    }
}
