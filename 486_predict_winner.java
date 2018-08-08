// Recursive approach _ Minimax approach studied in AI
// O(2^n) time and O(n) space complexity


 class Solution {
     boolean PredictTheWinner(int[] nums) {
        return winner(nums, 0, nums.length - 1, 1) >= 0;
    }
     //turn =1 for player-1 which maximises his ouput but turn=-1 for player-2 which minimizes his output.
    public int winner(int[] nums, int s, int e, int turn) {
        if (s == e)
            return turn * nums[s];
        int a = turn * nums[s] + winner(nums, s + 1, e, -turn);
        int b = turn * nums[e] + winner(nums, s, e - 1, -turn);
        return turn * Math.max(turn * a, turn * b);
    }
}



