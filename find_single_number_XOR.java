//// Solution without using extra space.

// A 2-pass solution to find the non-duplicate elements
class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        int xorRes=0;
        
        for(int num:nums)
            xorRes^=num;
        
        // The duplicate elements are eliminated from teh result. If 3(011) and 5(101) are non duplicates, xorRes would be 110.
        xorRes = xorRes & ~(xorRes-1); // calculated the rightmost 1 bit (to find the differnece).
        //System.out.println("val="+xorRes);
        for(int num:nums)   
        {
            res[((xorRes & num) == 0? 0:1)]^=num;
        }
        return res;
    }
}
