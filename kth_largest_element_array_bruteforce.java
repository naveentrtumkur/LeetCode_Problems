// Brute force approach is to sort the array and find kth largest fromthe end.
class Solution {
    public int findKthLargest(int[] nums, int k) {
        //Invalid case.
        if(k<1 || k> nums.length)
            return Integer.MIN_VALUE;
        //Using Java's sort function.
        Arrays.sort(nums);
        int j=nums.length-1;
        return nums[nums.length-k];
            
    }
}
