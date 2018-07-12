/*** The important thing is to consider all edge cases while thinking this problem through, including: negative integer, possible overflow, etc.

Use HashMap to store a remainder and its associated index while doing the division so that whenever a same remainder comes up, we know there is a repeating fractional part.
***/

 class Solution {
     String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0"; //SIMPLY return 0 iff numerator is zero.
        }
         
        StringBuilder res = new StringBuilder(); //Create a StringBuilder & start creating the decimal number.
        // "+" or "-"
        res.append(((numerator > 0) ^ (denominator > 0)) ? "-" : ""); //For fixing + or - of the final answer..
        long num = Math.abs((long)numerator);//numerator value
        long den = Math.abs((long)denominator);//denom value
        
        // integral part
        res.append(num / den); // Finding the intergal part
        num %= den;
        if (num == 0) {
            return res.toString(); //If no decimal numb possible return just the number.
        }
        
        // fractional part calculation being done
        res.append(".");// append a '.' and form the decimal value.
        Map<Long, Integer> map = new HashMap<>(); //Create a HashMap to store values.
        map.put(num, res.length()); 
        while (num != 0) {
            num *= 10;
            res.append(num / den);
            num %= den; //Keep on updating the num
            if (map.containsKey(num)) { //If repeating found, go to index and update the recurring value.
                int index = map.get(num);
                res.insert(index, "(");
                res.append(")");
                break;
            }
            else {
                map.put(num, res.length());
            }
        }
        return res.toString(); //Return the res string
    }
}
