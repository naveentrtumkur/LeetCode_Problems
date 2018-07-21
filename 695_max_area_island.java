// Similar problem to max number of islands possible.
// Time: O(R*C) and space is O(R*C)

class Solution {
    int[][] grid; // Members to store the input array
    boolean[][] seen; //bool value to store the visited nodes.

    // Method to find the area of island possible from a current point.
    public int area(int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length ||
                seen[r][c] || grid[r][c] == 0)
            return 0;
        seen[r][c] = true;
        return (1 + area(r+1, c) + area(r-1, c)
                  + area(r, c-1) + area(r, c+1));
    }

    // Method to calculate the max area of the island.
    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid; //init the grid
        seen = new boolean[grid.length][grid[0].length]; //init the boolean seen
        int ans = 0; //init answer to zero.
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                ans = Math.max(ans, area(r, c)); //recursively find the maximum area of island possible.
            }
        }
        return ans;
    }
}
