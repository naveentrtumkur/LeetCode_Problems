/* Generally we require three arrays with 3 dp array red, green, blue
 * red[i] is the minimum cost required for painting house i to red; red[i] = Math.min(green[i - 1], blue[i - 1]) + costs[i][0];
 * we only need data at i - 1 to update i, we need to store the i-1 datapoint instead of the whole array
 */ 

// This probelm is reduced to Time: O(n) and space: O(1)

class Solution {
    public int minCost(int[][] costs) {
        
    }
}
