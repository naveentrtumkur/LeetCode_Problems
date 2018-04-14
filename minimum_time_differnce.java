// Create a time list using teh timePoints given.
// Sort them using Java's Collections.sort() function and return the minimum time differnce.

class Solution {
    public int findMinDifference(List<String> timePoints) {
      
        int minTime = Integer.MAX_VALUE; 
        List<Integer> timeMints = new ArrayList<>();
        for(int i=0; i<timePoints.size();i++)
        {
            int h = Integer.valueOf(timePoints.get(i).substring(0,2));
            int m = Integer.valueOf(timePoints.get(i).substring(3,5));
            
            timeMints.add(h*60 + m);
        }
        
        // Java 8 lamda expression feature of specifying sort in ascending order in 1-line
        Collections.sort(timeMints,(Integer a, Integer b)-> a - b);
        
        for(int i=1; i< timeMints.size();i++)
        {
            if(timeMints.get(i) - timeMints.get(i-1) < minTime)
                minTime = timeMints.get(i) - timeMints.get(i-1);
            
        }
        
        //System.out.println("Val=" +timeMints.get(timeMints.size() -1));
        // Last 24th hour to zeroth minute.
        int boundary = timeMints.get(0) + (1440 - timeMints.get(timeMints.size() -1));
        
        //return the minimum value among two values calculated.
        return Math.min(minTime, boundary);
        
    }
}
