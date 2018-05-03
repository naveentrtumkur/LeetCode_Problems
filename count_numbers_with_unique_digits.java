//Write down the different values which u will get in order to solbve this problem.
// Then we understand that it is a combination problem.
// 9*9*8*7*6*5*4*3*2*1 (upto n=10), after that it will be zero.

class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int finAns = 10;
        
        if(n == 0)
            return 1;
        
        int comb = 9;
        for(int i=2;i<=n && i<=10 ;i++)
        {
            comb = comb*(9 - i + 2);
            finAns += comb;
        }
        
        return finAns;
        
        
    }
}
