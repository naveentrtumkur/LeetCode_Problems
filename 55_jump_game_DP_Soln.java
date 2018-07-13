//memoization  soln.
// Time O(N^2)
// Space O(N)
enum Index {
    GOOD, BAD, UNKNOWN
} //enum to store the good, bad andf unknown vals.

public class Solution {
    Index[] memo; //array ofindex

    public boolean canJumpFromPosition(int position, int[] nums) {
        if (memo[position] != Index.UNKNOWN) {
            return memo[position] == Index.GOOD ? true : false; //if good or bad, return that appropriately..
        }

        int furthestJump = Math.min(position + nums[position], nums.length - 1); //find the furthest jump...
        for (int nextPosition = position + 1; nextPosition <= furthestJump; nextPosition++) {
            if (canJumpFromPosition(nextPosition, nums)) {
                memo[position] = Index.GOOD;
                return true;
            }
        }

        memo[position] = Index.BAD; //if no good jump, assign bad and return
        return false;
    }

    public boolean canJump(int[] nums) { //check if a jump can be made & return accordingly.
        memo = new Index[nums.length];
        for (int i = 0; i < memo.length; i++) {
            memo[i] = Index.UNKNOWN;
        }
        memo[memo.length - 1] = Index.GOOD;
        return canJumpFromPosition(0, nums);
    }
}
