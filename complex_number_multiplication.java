// Convert String a = a +ib;
// Convert String b = c + id;

//Perform teh calculation and output the result.

class Solution {
    public String complexNumberMultiply(String a, String b) {
        
        String[] x = (a.split("\\+|i"));
        String[] y = (b.split("\\+|i"));
        
        int aVal = Integer.parseInt(x[0]);
        int aCom = Integer.parseInt(x[1]);
        
        int bVal = Integer.parseInt(y[0]);
        int bCom = Integer.parseInt(y[1]);
        
        String res = String.valueOf(aVal*bVal - aCom*bCom) + "+" + String.valueOf(aVal*bCom + aCom* bVal) + "i";
        return res;
        
    }
}
