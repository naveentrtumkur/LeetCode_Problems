public class Solution{
public int divide(int dividend, int divisor) {

    // Calculate the sign of the number.
    int sign = ((dividend < 0 && divisor >0) ||  (dividend >=0 && divisor < 0))?-1:+1;
    
    //convert the number to absolute values;
    
    long ldivid = Math.abs((long) dividend);
    long ldivis =  Math.abs((long)divisor);
    
    //System.out.println("ldivid="+ldivid);
    //System.out.println("ldivis"+ldivis);
    //Check for divided by zero error
   if(ldivis ==0)
       return Integer.MAX_VALUE;
    
    long ans = calculateDivision(ldivid, ldivis);
    if(ans > Integer.MAX_VALUE)
    {
       return  (sign == 1)? Integer.MAX_VALUE: Integer.MIN_VALUE;
    }
    System.out.println(ans);
    System.out.println(sign);
    int finalAns = (int) (ans*sign);
    //check for overflow
    
    //return the final answer
    return finalAns ;


}
    //Recursive function that will be called to calculate the division result.
    private long calculateDivision(long ldivid, long ldivis)
    {
        if(  ldivid < ldivis)
        {
           // System.out.println("returning zero");
            return 0;
        }
        
        long sum = ldivis;
        long count =1;
        
        while((sum+sum) <=ldivid)
        {
            sum += sum;
            count += count;
        }
        //System.out.println(count);
        return count+ calculateDivision(ldivid -sum, ldivis);
        
    }
    
    
}
