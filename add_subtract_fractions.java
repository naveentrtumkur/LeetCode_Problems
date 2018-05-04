// In order to avoid overflow error, we will be calculating GCd of first two fractions,
//Solve them simplify and then proceed.

class Solution {
    public String fractionAddition(String expression) {
        //List of signs to be stored.
        List<Character> sign = new ArrayList<>();
        
        //Prev fraction would be 0/1, you need to have + or - mandatorily.
        if(expression.charAt(0)!='-')
            sign.add('+');
        
        for(int i=0;i<expression.length();i++)
        {
            if(expression.charAt(i) == '+' || expression.charAt(i) == '-')
            {
                sign.add(expression.charAt(i));
            }
        }
        
        //Split the string into fractions between + and - sign.
        int i =0, prev_num = 0, prev_den = 1;
        for(String str: expression.split("(\\+)|(\\-)"))
        {
            //Check to see if the fraction length is greater than 0. If it is null return as it is.
            if(str.length() > 0)
            {
            String[] vals = str.split("/");
            //Get teh current numerator and denominator value.
            int num = Integer.parseInt(vals[0]);
            int den = Integer.parseInt(vals[1]);
            
            int g = Math.abs(gcd(den,num));
            
            if(sign.get(i++) == '+')
                prev_num = prev_num*den/g + num * prev_den/g;
            else
                prev_num = prev_num*den/g - num * prev_den/g;
            
            prev_den = den*prev_den/g;
            
            //Calculate teh gcd of current rersulting fraction and divide.
            g = Math.abs(gcd(prev_den,prev_num));
            
            prev_num/=g;
            prev_den/=g;
            }
        }
        
        return prev_num+"/"+prev_den;
    }
    
    public int gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp = b;
            b = a%b;
            a = temp;
        }
        
        return a;
    }
}
