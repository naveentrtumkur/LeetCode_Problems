//Solution approach-3

//This is a tricky solution with O(n^2) time complexity and (Ologn) space complexity for sorting.
// First sort the elements
// Then loop from i,j and find k satisfying the condition.
// j-1 to k-1 are the possible k values. count+= k-j-1
// After j is incremeneted, update the k value from k and beyond.


class Solution {
    public int triangleNumber(int[] nums) {
        int len = nums.length;
        int total = 0;
        Arrays.sort(nums);
        for(int i=0;i<len-2 ;i++)
        {
            int k = i+2;
            for(int j=i+1;j<len-1 && nums[i]!=0;j++)
            {
                while(k<len && nums[i]+nums[j] > nums[k] )
                    k++;
                
                total += k-j-1;
            }
        }
        
        //return the value of total caluclated.
        return total;
    }
}
