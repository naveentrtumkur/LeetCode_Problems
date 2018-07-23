// One pass Solution to the above problem.
// Have two pointers like p1 -> start and p2-> end of the array.
// Keep finding 0 and 2 and put them to appropriate positions in the array.

class Solution{
public void sortColors(int[] nums) {
    // 1-pass Solution to sort the colors.
    int p1 = 0, p2 = nums.length - 1, index = 0;
    while (index <= p2) {
        if (nums[index] == 0) { //If the numb is 0 then update index and pointer-1
            nums[index] = nums[p1];
            nums[p1] = 0;
            p1++;
        }
        if (nums[index] == 2) { //If the number if 2 then update index and pointer-2
            nums[index] = nums[p2];
            nums[p2] = 2;
            p2--;
            index--;
        }
        index++; //Increment the index.
    }
}
}
