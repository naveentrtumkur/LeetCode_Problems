// Time : Probably O(1) or O(n) and Space : O(1) 

class Solution {
    
 // These are some of the tricky declarations which need to be taken care of.
 // Numbers less than 20, Numbers multiple of ten < 100 and thousands, million, billion.   
 final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
 final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
 final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};

// Implementation of conversion from integer to words.   
public String numberToWords(int num) {
    if (num == 0) return "Zero";

    int i = 0;
    String words = "";
    
    while (num > 0) {
        if (num % 1000 != 0)
    	    words = helper(num % 1000) +THOUSANDS[i] + " " + words;
    	num /= 1000;
    	i++;
    }
    
    return words.trim();
}

 // Recursive helper function which converts numbers less than thousand to words and concatenates them to previous string.
 String helper(int num) {
    if (num == 0)
        return "";
    else if (num < 20)
        return LESS_THAN_20[num] + " ";
    else if (num < 100)
        return TENS[num / 10] + " " + helper(num % 10);
    else
        return LESS_THAN_20[num / 100] + " Hundred " + helper(num % 100);
}
}
