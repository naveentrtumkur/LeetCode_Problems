// Remove k-digits from a string to form the smallest integer.

class Solution {
     String removeKdigits(String num, int k) {
        int digits = num.length() - k; //Count of digits to retain
        char[] temp = new char[num.length()]; // Create an array equal to number of characters in string.
        int top = 0;
        // k keeps track of how many characters we can remove
        // We need to chek that if the previous character in stk is larger than the current one
        // then removing it will get a smaller number
        // but we can only do so when k is larger than 0
        for (int i = 0; i < num.length(); ++i) {
            char c = num.charAt(i);
            while (top > 0 && temp[top-1] > c && k > 0) {
                top -= 1;
                k -= 1; //removing the TOS and decrementing the k-value.
            }
            temp[top++] = c;
        }
        // find the index of first non-zero digit
        int index = 0;
        while (index < digits && temp[index] == '0') index++;
        return index == digits? "0": new String(temp, index, digits - index); //returning statemnt, return 0 or the non-zero index to form the result.
    }
}
