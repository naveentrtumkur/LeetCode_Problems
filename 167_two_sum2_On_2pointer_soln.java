//Two pointer Solution to find the answer.
// This is O(n) solution for the problem given..
class Solution {
   public int[] twoSum(int[] num, int target) {
    int[] index = new int[2];
    if (num == null || num.length < 2) return index;
    int left = 0, right = num.length - 1;
    while (left < right) {
        int val = num[left] + num[right];
        if (val == target) {
            index[0] = left + 1;
            index[1] = right + 1;
            break;
        } else if (val > target) {
            right --;
        } else {
            left ++;
        }
    }
    return index;
}
}
