// Binary search approach.
// Find the first and last position of a particular target in the array.
// Do it in O(logn) time complexity.
// If no target is found return [-1, -1]


//Brute force approach: 
// --> First scan from left to right to find first index.
// --> Second scan from right to left to find second index.
// This approach would consume O(n) time complexity.

class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        
        
    int[] ret = {-1, -1}; //by default it's -1, -1
        if(nums == null || nums.length ==0)
            return ret;
        int n = nums.length;
         int i = 0, j = n - 1;
    // Search for the left one
    while (i < j)
    {
        //finding the leftmost index
        int mid = (i + j) /2;
        if (nums[mid] < target) i = mid + 1;
        else j = mid;
    }
    if (nums[i]!=target) return ret;
    else ret[0] = i;
    
    // Search for the right one
    j = n-1;  // We don't have to set i to 0 the second time.
    while (i < j)
    {
        //finding the rightmost index....
        int mid = (i + j) /2 + 1;	// Make mid biased to the right
        if (nums[mid] > target) j = mid - 1;  
        else i = mid;				// So that this won't make the search range stuck.
    }
    ret[1] = j;
    return ret; //return the computed result...
    }
}
