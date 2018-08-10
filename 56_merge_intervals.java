/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */

// Carefully look at the Interval Class implementation to solve this probelm.
// Soln is sorting based on teh starting interval to get all teh contiguous intervals together.
// Algorithm is as follows:-
// - if prev.end < cur.start then intervals are fine so continue.
// - else there is a overlap and hence merge prev and current interval.

// Time: O(nlogn) --Mainly for sorting (collections.sort()) and Space: O(1) if in-place else O(n) if extra space used

class Solution {
    //Over-ride comparator interface and sort based on start indices.
    private class IntervalMerge implements Comparator<Interval>
    {
        public int compare(Interval a, Interval b)
        {
            return a.start < b.start?-1:a.start == b.start?0:+1; //Just sorting based on start intervals.
        }
    }
    public List<Interval> merge(List<Interval> intervals) {
        //Sorting
        Collections.sort(intervals, new IntervalMerge());
        
        //Create a new list to store the new intervals that are modified based on overlap/non-overlap.
        LinkedList<Interval> result = new LinkedList<Interval>();
        
        //Loop across all the intervals.
        for(Interval inter: intervals)
        {
            //If the previous interval's end is less than current then just append current Interval and continue.
            if(result.isEmpty() || (result.getLast().end < inter.start))
                result.add(inter);
            
            //Else compare the prev.end and cur.end and append appropriate overlapped interval.
            else
            {
                result.getLast().end = Math.max(result.getLast().end, inter.end);
            }
        }
        
        return result; //Return the final list of Intervals.
    }
}
