// Convert String a = a +ib;
// Convert String b = c + id;

//Perform teh calculation and output the result.

class Solution {
    public String complexNumberMultiply(String a, String b) {
        
        // I'll  be using functions to get the int values i..e real and imaginary parts of numbers.
        int[] x = getVal(a);
        int[] y = getVal(b);
        
        //Get the first CN values
        int aVal = x[0];
        int aCom = x[1];
        
        //Get the second CN values
        int bVal = y[0];
        int bCom = y[1];
        
       /* int aVal = Integer.parseInt(x[0]);
        int aCom = Integer.parseInt(x[1]);
        
        int bVal = Integer.parseInt(y[0]);
        int bCom = Integer.parseInt(y[1]);
        */
        
        String res = String.valueOf(aVal*bVal - aCom*bCom) + "+" + String.valueOf(aVal*bCom + aCom* bVal) + "i";
        return res;
        
    }
    
    public int[] getVal(String a)
    {
        String[] x = a.split("\\+");
        
        int[] val = new int[2];
        val[0] = Integer.parseInt(x[0]);
        
        val[1] = Integer.parseInt(x[1].replace("i",""));
        
        return val;
    }
}
