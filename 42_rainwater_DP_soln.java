// Dp Solution. Memoization usin left_max and right_max arrays.

class Solution {
    int trap(int[] height)
    {
	if(height == null || height.length == 0)
		return 0;
    int ans = 0;
    int size = height.length;
    int[] left_max = new int[size]; //left_max memoization.
    int[] right_max = new int[size];//right_max memoization.
    left_max[0] = height[0];
    for (int i = 1; i < size; i++) {
        left_max[i] = Math.max(height[i], left_max[i - 1]); //Calculate all teh left_max upto that index
    }
    right_max[size - 1] = height[size - 1];
    for (int i = size - 2; i >= 0; i--) {
        right_max[i] = Math.max(height[i], right_max[i + 1]); // calculate all the right max upto that index..
    }
    for (int i = 1; i < size - 1; i++) {
        ans += Math.min(left_max[i], right_max[i]) - height[i]; //update teh answer value.
    }
    return ans;//return the calculated answer value..
}
}
