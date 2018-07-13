// Prime factorization method to arrive at a solution .
// Split into groups such that each have lengths c1, c2, c3 and so on....

// Final answer would be the product, c1 x c2 x c3 and so on.....

class Solution {
    public int minSteps(int n) {
        
        int ans = 0, div = 2;// Init the ans to 2 and div value to 2.
        while(n > 1)//Loop untill n > 1
        {
            while(n%div ==0)
            {
                ans += div;
                n /=div;
            }
            div++;
        }
        
        //return the final answerr..
        return ans;
    }
}
