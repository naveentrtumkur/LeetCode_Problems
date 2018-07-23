// Simple two pass Solution to perform the sorting.
// Complexity is O(2n) and space is O(1)
// Get the count of red, white and blue balls in first pass
// and assign them in the second pass...

class Solution{
public void sortColors(int[] nums) {
    // 2-pass SOlution by finding the counts.
    int count0 = 0, count1 = 0, count2 = 0;
    for (int i = 0; i < nums.length; i++) { //Loop over the numbers and find the count of balls.
        if (nums[i] == 0) {count0++;}
        if (nums[i] == 1) {count1++;}
        if (nums[i] == 2) {count2++;}
    }
    // after having calculated the counts, insert them in place.
    for(int i = 0; i < nums.length; i++) {
        if (i < count0) {nums[i] = 0;}
        else if (i < count0 + count1) {nums[i] = 1;}
        else {nums[i] = 2;}
    }
}
}
