//Using DP bottom up approach

class Solution {
    public double largestSumOfAverages(int[] A, int K) {
       
        int N = A.length;
        
        //Array P to store temp values.
        double[] P = new double[N+1];
        
        for(int i=0;i<N;i++)
            P[i+1] = P[i]+A[i];
        
        //Calculate the initial dp value.
        double[] dp = new double[N];
        
        //Fill up the initial dp value.
        for(int i=0;i<N;i++)
            dp[i] = (P[N] - P[i])/(N-i);
        
        //Start the loop to calculate the K-partitions.
        
        for(int k=0;k<K-1;k++)
        {
            for(int i=0;i<N;i++)
            {
                for(int j=i+1;j<N;j++)
                {
                    //Calculated value can be avg or max aver + dp[i]
                    dp[i] = Math.max(dp[i], (P[j] - P[i])/(j-i)+dp[j]);
                    
                    
                }
            }
        }
        
        return dp[0];
        
        
        
    }
}
