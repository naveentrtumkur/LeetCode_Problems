// Solution to shuffle array problem by using fisher-Yates algorithm.

class Solution {
    int[] array;
    int[] origArray;
    private Random ran = new Random();
    public int ranShuffle(int min, int max)
    {
        return ran.nextInt(max - min) + min;
    }
    public Solution(int[] nums) {
        array = new int[nums.length];
        origArray = new int[nums.length];
        for(int i=0;i<nums.length;i++)
            array[i] = nums[i];
        
        origArray = array.clone();
        //for(int i=0;i<nums.length;i++)
          //  origArray[i] = nums[i];
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        //reset back the array and return the array.
        for(int i=0;i<array.length;i++)
            array[i] = origArray[i];
        
        return array;
    }
    
    // Shuffling by making use of fisher-Yates algorithm.
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        
        //shuffle from first element to the last element.
        // Use ranShuffle function to achieve the shuffling process.
        for(int i=0;i<array.length;i++)
        {
            swap(array,i,ranShuffle(i,array.length));
        }
        
        return array;
    }
    
    public void swap(int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
