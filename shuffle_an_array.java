/*

shuffle an array.

Shuffle a set of numbers without duplicates.

Example:

// Init an array with set 1, 2, and 3.
int[] nums = {1,2,3};
Solution solution = new Solution(nums);

// Shuffle the array [1,2,3] and return its result. Any permutation of [1,2,3] must equally likely to be returned.
solution.shuffle();

// Resets the array back to its original configuration [1,2,3].
solution.reset();

// Returns the random shuffling of array [1,2,3].
solution.shuffle();

*/



class Solution {
     int[] origArr;
    int[] arr;
    //This is like a constructor.
    public Solution(int[] nums) {
        arr = new int[nums.length];
        origArr = new int[nums.length];
        for(int i=0;i<nums.length;i++)
            arr[i] = origArr[i]= nums[i];
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        for(int i=0;i<origArr.length;i++)
        {
            arr[i] = origArr[i];
        }
        
        return arr;
        
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<origArr.length;i++)
        {
            int j=1, n = origArr.length;
            do{
                 j = (int) (Math.random()*n );
                //System.out.println("inside="+j);
                
            }
            while(set.contains(j));
            set.add(j);
            //System.out.println("j val="+origArr[j]);
            arr[i] = origArr[j];
        }
        return arr;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
