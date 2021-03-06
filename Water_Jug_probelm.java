//Typical Water and Jug problem
/*
You are given two jugs with capacities x and y litres. There is an infinite amount of water supply available. You need to determine whether it is possible to measure exactly z litres using these two jugs.

If z liters of water is measurable, you must have z liters of water contained within one or both buckets by the end.

Operations allowed:

Fill any of the jugs completely with water.
Empty any of the jugs.
Pour water from one jug into another till the other jug is completely full or the first jug itself is empty.
Example 1: (From the famous "Die Hard" example)

Input: x = 3, y = 5, z = 4
Output: True
Example 2:

Input: x = 2, y = 6, z = 5
Output: False
*/

class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
        // Solution would be using Bezot's theorem.
        // ax + by = d ... Find the smallest number d satisfying this condition.
        
        if( x+y < z)
            return false;
        
        // If one of the followig conditions are met, return true.
        if(x == z || y == z || (x+y) == z)
            return true;
        
        //return true if value can be found else return false.
        return z%GCD(x,y) == 0;
    }
    
    //GCD Calculation
    public int GCD(int a, int b)
    {
        while(b!=0)
        {
            int temp = b;
            b = a%b;
            a= temp;
        }
        return a;
    }
}
