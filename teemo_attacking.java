class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        //List<Integer> list = new ArrayList<>();
        if(timeSeries.length == 0 || duration == 0)
            return 0;
        
        // This would be the total time Ashe is poisonned
        int total = 0;
        int start = timeSeries[0], end = duration + timeSeries[0];
        
        for( int i=1; i<timeSeries.length; i++)
        {
            
            if( timeSeries[i] > end)
            {
                total += end-start;
                start=timeSeries[i];
            }
            
            //reset the end timer.
            end = duration + timeSeries[i];
        }
        total += end -start;
        //finally return the calculated value of sum.
        return total;
    }
}
