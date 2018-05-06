//Make use of arithmatic progression formula.

// Sn = n/2[2a + (n-1)d]
// Sn = n*a + n/2 * (n-1) *d

// If a = [N - (n-1) *n/2]/n is an integer, increment the count value.

class Solution {
    public int consecutiveNumbersSum(int N) {
        
        if(N==0)
            return 1;
        
        int count =1; // for the number itself.
        
        for(int i=2;i<=N;i++)
        {
            int sum = (i-1)*i/2;
            int an = N - sum;
            //System.out.println("val="+an);
            if(sum>=N)//integer would become 0 or less
                break;
           int a = an/i;
            
            if( a*i == an)
                count++;
        }
        
        return count;
    }
}
