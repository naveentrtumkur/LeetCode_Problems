//This solution is O(n2) time complexity.
// Bruteforce solution.

class Solution {
    int trap(int[] height)
    {
    int ans = 0; //Store the answer variable initialized to zero.
    int size = height.length; //find the height...
    
    //Iterate from 1 to size - 1, find the max_left & max_rigth and add caclulated 
    // result to the answer.
    for (int i = 1; i < size - 1; i++) {
        int max_left = 0, max_right = 0;
        for (int j = i; j >= 0; j--) { //Search the left part for left_max
            max_left = Math.max(max_left, height[j]);
        }
        for (int j = i; j < size; j++) { //Search the right part for right_max
            max_right = Math.max(max_right, height[j]);
        }
        ans += Math.min(max_left, max_right) - height[i]; //Add the min of left_max and right_max to answer.. 
    }
    return ans;//return the calculated answer value..
}
}
