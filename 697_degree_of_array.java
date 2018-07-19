//The intuition to solve this problem would involve O(n) time complexcity
// and O(n) space complexity....

/*** For each element in the given array, let's know left, the index of its first occurrence; and right, the index of its last occurrence. For example, with nums = [1,2,3,2,5] we have left[2] = 1 and right[2] = 3.

Then, for each element x that occurs the maximum number of times, right[x] - left[x] + 1 will be our candidate answer, and we'll take the minimum of those candidates.
****/


class Solution {
    public int findShortestSubArray(int[] nums) {
       
        //create a Map for left, right and count of numbers encountered.....
         Map<Integer, Integer> left = new HashMap(),
            right = new HashMap(), count = new HashMap();
        
        // Iterate from 0 -> n and populate left, right and count vals...
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (left.get(x) == null) left.put(x, i);
            right.put(x, i);
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        int ans = nums.length;
        int degree = Collections.max(count.values()); //finds the max from collections method max()
        for (int x: count.keySet()) {
            if (count.get(x) == degree) {
                ans = Math.min(ans, right.get(x) - left.get(x) + 1); //compute the minimum sunbarray
            }
        }
        return ans; //return the computed ans
    }
}
