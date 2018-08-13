/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }               
 * }
 */
class Solution {
    public boolean canAttendMeetings(Interval[] intervals) {
        //Sort the intervals based on meeting starting position
        Arrays.sort(intervals, new Comparator<Interval>()
        {
            public int compare(Interval a, Interval b)
            {
                if(a.start < b.start)
                    return -1;
                else
                    return 1;
            }
        });
        
        for(int i=0;i<intervals.length - 1;i++)
        {
            if(intervals[i].end > intervals[i+1].start) //if two mettings are consecutive then it can be attended
                return false;
        }
        
        return true;
        
    }
}
