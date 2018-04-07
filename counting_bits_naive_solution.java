// Naive solution using hamming weights.

class Solution {
    public int[] countBits(int num) {
        
        int[] res = new int[num+1];
        
        for(int i=0; i<=num; i++)
        {
            
            res[i] = hammingWeight(i);
        }
        // Return the result computed.
        return res;
        
    }
    
    int hammingWeight(int n)
    {
        return n==0?0:1+hammingWeight(n&n-1);
    }
}
