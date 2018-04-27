class Solution
{
public int rob(int[] nums) {
    if(nums.length<1) return 0;     
    if(nums.length<2) return nums[0];          
    return Math.max(rob(new int[nums.length], nums, 0, nums.length-1), rob(new int[nums.length], nums, 1, nums.length)); 
}
public int rob(int[] Rob, int[] nums, int start, int end) {
    if(start == 0) {//in case of we rob house 0 to n-2, and it is the same as House rober question 1
    	Rob[0] = nums[0];
    	Rob[1] = Math.max(nums[0],nums[1]);
    }
    else //in case of we rob house 1 to n-1
        Rob[1] = nums[1];        
    //the same as House rober question 1
    for (int i=2; i<end; i++){
        Rob[i] = Math.max(Rob[i-2]+nums[i], Rob[i-1]);            
    }
    return Rob[end-1];
}
}
