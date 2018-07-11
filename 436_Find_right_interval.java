/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */

// Solution would be to sort the Intervals based on the start-points and then 
// choose the statrting intervals closest to the previous ending interval.

class Solution {
    public int[] findRightInterval(Interval[] intervals) {
        int n = intervals.length; //Find the number of intervals.
        int[] results = new int[n];  // Create an Array of Intervals class.
        results[0] = -1; // Initialize res[0] to -1.
        if (n == 1) return results; // If just 1 interval return that.
        
        Interval[] temp = new Interval[n];
        for (int i = 0; i < n; ++i){
            Interval value = new Interval(intervals[i].start, i);
            temp[i] = value; //Fill in the temp values of Interval Array.
        }
        
        //SORT THE array based on interval start time.
        // Override the comparator interface and implement copare method.
        Arrays.sort(temp, new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {
				return o1.start - o2.start;
			}
		});
		
        //performing a binary search...
		for (int i = 0; i < n; ++i){
		    
		    int left = 0; //left index
		    int right = n-1; //right index
		    int index = -1; //curr index of result.
		    while (left <= right){
		        int mid = left + (right - left)/2;
		        
		        if (temp[mid].start == intervals[i].end){
		            index = temp[mid].end;
		            break;
		        }
		        else if (temp[mid].start > intervals[i].end){
		            index = temp[mid].end;
		            right = mid -1;
		        }
		        else{
		            left = mid + 1;
		        }
		    }
		    
		    results[i] = index;
		}
		
		return results;
    }
}
