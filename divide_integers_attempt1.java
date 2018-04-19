//I will be using a repeated division technique to find teh solution to the given probelm.

class Solution {
    public int divide(int dividend, int divisor) {
        //Caclulate the sign of divisior and dividend
        int sign = ((dividend <0 &&divisor > 0) || (divisor <0 && dividend >=0) ? -1:+1);
        
        //Check divided by zero error and return appropriate value.
        if(divisor ==0)
            return Integer.MAX_VALUE;
        
        divisor =(int) Math.abs(divisor);
        dividend = (int) Math.abs(dividend);
        
        int count =0;
        while(dividend > divisor)
        {
            count++;
            dividend = dividend - (divisor);
        }
        
        if(divisor == dividend)
            count++;
        
        return sign*count;
    }
}
