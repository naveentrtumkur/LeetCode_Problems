/*

The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Now your job is to find the total Hamming distance between all pairs of the given numbers.

Example:
Input: 4, 14, 2

Output: 6

Explanation: In binary representation, the 4 is 0100, 14 is 1110, and 2 is 0010 (just
showing the four bits relevant in this case). So the answer will be:
HammingDistance(4, 14) + HammingDistance(4, 2) + HammingDistance(14, 2) = 2 + 2 + 2 = 6.

*/



// My solution gives O(32n)~~ O(n) time complexity and O(1) space complexity.

/*

1. from bits 1-32 find the count of numbers where that bit is set.
2. If K numbers out of n have that bit set, then n-K do not have thta bit set.
    total_hamming += k * (n-k);
3. This would be the correct value.
    
*/

class Solution {
    public int totalHammingDistance(int[] nums) {
        int len = nums.length, total_hamming = 0;
        
        //Loop from 0 till 32 bit;
        for(int i=0;i<32;i++)
        {
            int count = 0;
            for(int j=0;j<len;j++)
            {
                count += (nums[j]>>i)&1;
            }
            //update the total hamming distance value.
            total_hamming += count* (len-count);
        }
        
        return total_hamming;
        
    }
}
