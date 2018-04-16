// Solution using Stack approach. (Next soln would be DP approach)
// COmplexity O(n) space and O(n) time-complexity


class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[nums.length];
        if(nums.length == 0)
            return res;
        
        stack.push(0);
        
        for(int i= nums.length*2 -1;i>=0; i--)
        {
            while(!stack.isEmpty() && nums[stack.peek()] <= nums[i%nums.length])
                stack.pop();
        
        
        res[i%nums.length] = stack.isEmpty()?-1: nums[stack.peek()];
       stack.push(i%nums.length);
                                           
        }
        
        return res;
        
    }
}
