//Recursive solution to check if a number is additive or not.
import java.math.BigInteger;

class Solution {
    public boolean isAdditiveNumber(String num) {
        if(num == null || num.length() < 3 )
            return false;
        
        for(int i=1; i<=num.length()/2;i++)
        {
            if(num.charAt(0) == '0' && i>1)
                return false;
            BigInteger x1 = new BigInteger(num.substring(0,i));
            for(int j=1;Math.max(i,j)<=num.length()-i-j;j++)
            {
                if(num.charAt(i) == '0' && j>1)
                    break;
                BigInteger x2 = new BigInteger(num.substring(i,i+j));
                if(checkAdditive(num,x1,x2,i+j))
                    return true;
            }
        }
        
        //No such thing exits, return additive number doesn't exist.
        return false;
    }
    
    
    public boolean checkAdditive(String num, BigInteger x1, BigInteger x2,int start)
    {
        if(start == num.length())
            return true;
        
        x2 = x2.add(x1);
        x1 = x2.subtract(x1);
        
        String str = x2.toString();
        
        return num.startsWith(str,start) && checkAdditive(num,x1,x2,start+str.length());
    }
}


