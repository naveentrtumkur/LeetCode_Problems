// Straight forward solution which IO can think of is use a switch to find the character identified.
// Store them by using O(n) space.
// Then in second pass compute the sum and return the value.
// Question: How to make it efficient by avoiding space and computing in one pass..???


// Time: O(n)
// Space : O(1) or constant space soln.
class Solution {
    
    public int romanToInt(String s) {
        int total = 0; // Var to hold the total result
        if(s.length() == 0) return total; //base case
        
        // Loop from 1 to n
        for (int i = 0; i < s.length() - 1; i++) 
        {
            // Get the cur value and next value and compute the total value.
            int cur = get_intVal(s.charAt(i));
            int nex = get_intVal(s.charAt(i+1));
            if(cur < nex) //If cur < next subtract else add it to the total Sum....
            {
                total -= cur;
            }
            else
            {
                total += cur;
            }
        }
        return total + get_intVal(s.charAt(s.length()-1)); //We would have missed last charcter so do for that.
    }
    
    // This is a method to get the int value of current character being encountered, 
     public int get_intVal(char c){
        switch (c)
        {
            case 'M': //M = 1000
                return 1000;
            case 'D': //D = 500
                return 500;
            case 'C': //C = 100
                return 100;
            case 'L': //L = 50
                return 50;
            case 'X' : //X = 10
                return 10;
            case 'V': // V = 5
                return 5;
            case 'I': // I = 1
                return 1;
        }
        throw new IllegalArgumentException("Not valid charcter"); // throw illegal Argument Exception
    }
}


