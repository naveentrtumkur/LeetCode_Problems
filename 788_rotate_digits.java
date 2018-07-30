class Solution {
    public int rotatedDigits(int N) {
        int count = 0; //Count of how many numbers are valid (rotated and form different number)
        for (int i = 1; i <= N; i ++) { //loop from 1 to N and check if it's valid number. If so, increment count.
            if (isValid(i)) count ++;
        }
        return count; //return count.
    }
    
    public boolean isValid(int N) {
         //If N contains 2 or 5 or 6 or 9 it would be valid
         // else if it's 3, 4 or 7 it's invalid.
         
        boolean validVal = false;
        while (N > 0) {
            if (N % 10 == 2) validVal = true;
            if (N % 10 == 5) validVal = true;
            if (N % 10 == 6) validVal = true;
            if (N % 10 == 9) validVal = true;
            if (N % 10 == 3) return false;
            if (N % 10 == 4) return false;
            if (N % 10 == 7) return false;
            N = N / 10;
        }
        return validVal;
    }
}
