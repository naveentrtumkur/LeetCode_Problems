//Approach-3 using formula.

class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        //maintain the count of total such ArthmSequence possible.
        int[] res = new int[A.length];
        int sum = 0;
        int count=0;
        
        //iterate every three elements and store the result in res array.
        for(int i=2;i<A.length;i++)
        {
            
           if(A[i] - A[i-1] == A[i-1] - A[i-2])
           {
               count++;
              
           }
            else
            {
                 sum+=(count*(count+1))/2;
                count=0;
                
            }
               
    }
        return sum+=(count*(count+1))/2;
    }
}
