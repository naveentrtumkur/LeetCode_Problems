class Solution {
    public int minMoves2(int[] nums) {
        // Correct approach:- Initially sort the array
        // Find teh middle element
        // Keep on calculating the sum of rigth and left elemtns.
        // This is like the will eventually become equal to mid element value.
        Arrays.sort(nums);
        int len = nums.length;
        int i =0, j = len-1;
        int count = 0;
        while(i < j)
        {
            count += nums[j] - nums[i];
            i++;
            j--;
        }
        
        return count;
    }
}
