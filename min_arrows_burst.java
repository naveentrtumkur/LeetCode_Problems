/*


Input:
[[10,16], [2,8], [1,6], [7,12]]

Output:
2

Explanation:
One way is to shoot one arrow for example at x = 6 (bursting the balloons [2,8] and [1,6]) and another arrow at x = 11 (bursting the other two balloons).

*/

// This problem would require a greedy solution.
// 1. sort the array based on second value.
// Select the first second value and check how many balloons burst.
// Move on to next ith value second elemtn and continue process till all balloons burst out.

class Solution {
    public int findMinArrowShots(int[][] points) {
       // This would be the base case.
        if(points.length == 0)
            return 0;
        //Sort the array according to second value in ascending order.
        Arrays.sort(points,(int[] a,int[] b) -> a[1] - b[1]);
        
        
        int burstPosition = points[0][1];
        int arrowCount = 1;
        for(int i=1;i<points.length;i++)
        {
            if(burstPosition >= points[i][0])//This condition should be sufficient,Since array is sorted.
                continue;
            
            //Maximum balloons that could be burst are checked, increment the count.
            arrowCount++;
            burstPosition = points[i][1]; //change the burst poisition.
            
        }
        
        //Now return the arrowCount;
        return arrowCount;
    }
}
