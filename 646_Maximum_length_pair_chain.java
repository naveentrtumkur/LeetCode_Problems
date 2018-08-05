// Greedy solution by first sorting the input array.
// In Java we need to override comparator interface or simply use lambda expression to sort 2 D array based on second position

// Time: O(nlogn)
// Space: O(1) - inplace or arguably O(n) if extra space is used, w/o disturbing given array
class Solution {
    public int findLongestChain(int[][] pairs) {
        
        int prev_low = Integer.MIN_VALUE, total = 0; //Vars to hold prev min and longest chain
        //Sort the input array (Java's Lambda expression)
        Arrays.sort(pairs,(a, b)->a[1] - b[1]);
        
        for(int[] pair:pairs)
        {
            if(prev_low < pair[0])
            {
                prev_low = pair[1]; //Added to the chain
                total++;
            }
        }
        
        //Return the computed total.
        return total;
    }
}
