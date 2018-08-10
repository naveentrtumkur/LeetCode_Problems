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
    public List<Interval> merge(List<Interval> intervals) {
        
    }
}
