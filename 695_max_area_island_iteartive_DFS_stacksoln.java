// Iterative DFS Solution using Stack.

//TIme : O(Row*col) and space is also same.

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] seen = new boolean[grid.length][grid[0].length]; //Seen array to mark a node as visited.
        int[] dr = new int[]{1, -1, 0, 0}; 
        int[] dc = new int[]{0, 0, 1, -1};

        int ans = 0; //Init ans to 0.
        for (int r0 = 0; r0 < grid.length; r0++) {
            for (int c0 = 0; c0 < grid[0].length; c0++) {
                if (grid[r0][c0] == 1 && !seen[r0][c0]) {
                    int shape = 0; //Iteartive value to find the area of the current shape.
                    Stack<int[]> stack = new Stack(); //Create a stack
                    stack.push(new int[]{r0, c0});
                    seen[r0][c0] = true; //Mark the row-col as visited.
                    while (!stack.empty()) {
                        int[] node = stack.pop();
                        int r = node[0], c = node[1];
                        shape++;
                        for (int k = 0; k < 4; k++) {
                            int nr = r + dr[k]; //new row updation
                            int nc = c + dc[k]; //new column updation
                            if (0 <= nr && nr < grid.length &&
                                    0 <= nc && nc < grid[0].length &&
                                    grid[nr][nc] == 1 && !seen[nr][nc]) {
                                stack.push(new int[]{nr, nc});
                                seen[nr][nc] = true; //Mark node as seen
                            }
                        }
                    }
                    ans = Math.max(ans, shape); //update the ans value
                }
            }
        }
        return ans;
    }
}
