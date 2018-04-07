//Approch-1 using Brute force

class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        //maintain the count of total such ArthmSequence possible.
        int count = 0;
        int sum = 0;
        
        //iterate from 0th till last but second element
        for(int i=0;i<A.length-2;i++)
        {
            // store the differnce in a variable.
            int d = A[i+1] - A[i]; 
            
            //second loop from 3rd to last elements.
            for(int j=i+2; j<A.length; j++)
            {
                if(A[j] - A[j-1] == d)
                {
                    count++;
                    sum+=count;
                }
                else
                {
                    count = 0;
                    break;
                }
                count=0;
            }
        }
        return sum;
    }
}
