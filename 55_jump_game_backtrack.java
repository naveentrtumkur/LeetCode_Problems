//Backtracking inefficient soln.
// Time O(2^N)
// Space O(N)

 class Solution {
    public boolean canJumpFromPosition(int position, int[] nums) {
        if (position == nums.length - 1) { //if currently at last element return true
            return true;
        }

        int furthestJump = Math.min(position + nums[position], nums.length - 1); //finmd the furthest jump possible from curr position
        for (int nextPosition = position + 1; nextPosition <= furthestJump; nextPosition++) {
            if (canJumpFromPosition(nextPosition, nums)) { //for every next position check if end is reachable.
                return true;
            }
        }

        return false; //return false at the end
    }

    public boolean canJump(int[] nums) {
        return canJumpFromPosition(0, nums); //initial function.
    }
}
