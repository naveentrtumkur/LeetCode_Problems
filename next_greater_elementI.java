// My Solution is to hold a stack which conatins the decreasing sequence of number.
// A map which stores teh element and it's next highest in teh array.

// Calculate all teh values and return appropriate value.

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        //stack.push(nums1[0]);
        for(int i=0;i<nums2.length;i++)
        {
            while(!stack.isEmpty() && nums2[i] > stack.peek())
            {
                map.put(stack.pop(),nums2[i]);
                
            }
            stack.push(nums2[i]);
            
        }
        
        int[] res = new int[nums1.length];
        for(int i =0;i<nums1.length;i++)
        {
            res[i] = map.getOrDefault(nums1[i], -1);
        }
        return res;
    }
}
