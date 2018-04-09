//Alternate method for teemo attacking using Java programming language.

class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        //List<Integer> list = new ArrayList<>();
        if(timeSeries.length == 0 || duration == 0)
            return 0;
        
        // This would be the total time Ashe is poisonned
        //Alternate approach, keep addidng the tiemframe and come at he solution.
        
        int total=0, start = timeSeries[0], end = duration+timeSeries[0];
        
        for(int i=1;i<timeSeries.length;i++)
        {
            if(end < timeSeries[i])
            {
                total+= duration;
                start = timeSeries[i];
            }
            else
            {
                total+= timeSeries[i] - start;
                start = timeSeries[i];
            }
            
            end = timeSeries[i] + duration;
        }
        
        total+= end -start ;
        //finally return the calculated value of sum.
        return total;
    }
}
