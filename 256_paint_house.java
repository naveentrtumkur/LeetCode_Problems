/* Generally we require three arrays with 3 dp array red, green, blue
 * red[i] is the minimum cost required for painting house i to red; red[i] = Math.min(green[i - 1], blue[i - 1]) + costs[i][0];
 * we only need data at i - 1 to update i, we need to store the i-1 datapoint instead of the whole array
 */ 

// This problem is reduced to Time: O(n) and space: O(1)

class Solution {
    public int minCost(int[][] costs) {
        int red_cost = 0, blue_cost = 0, green_cost = 0;
        
        for(int i=0;i<costs.length;i++) // loop from 0 to n-1
        {
            int temp_red = red_cost;
            
            red_cost = Math.min(blue_cost,green_cost) + costs[i][0]; // choose min among blue, green and add red value. prev cannot be red again so we need to do this.
            
            int temp_blue = blue_cost;
            
            blue_cost = Math.min(temp_red,green_cost) + costs[i][1];
            
            green_cost = Math.min(temp_red, temp_blue) + costs[i][2];
        }
        
        return Math.min(Math.min(red_cost, blue_cost),green_cost);
    }
}
