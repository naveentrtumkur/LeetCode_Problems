class Solution {
    public int minMoves2(int[] nums) {
        // My solution consists of the following main points:-
        // 1. n = length(array)
        // 2. sum = sum  of elements
        // 3. moves = sum - (count of elements * reqd value.)
        
        int n = nums.length;
        int sum = 0;
        for(int x:nums)
            sum += x;
        
        int res =(int) (Math.abs(sum/n));
        return res;
    }
}
