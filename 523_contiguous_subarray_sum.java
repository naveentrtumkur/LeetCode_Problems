// HashMap Solution to approach this problem.

//  The logic is as follows:
/*  - Find the sum upto index i and modulo that by k.
    - If you encounter that value again say at index j, that means a multiple of k exists from i to j.
    - Hence you can directly return true.
    
    sum + n * k @ index-i would be equal to some sum + m*k where n,m > 0
    
    Time: O(n)
    Space: Space O(n) {precisely O(min(n,k))}
*/

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int sum = 0;
        
        Map<Integer, Integer> map = new HashMap<>();// declare a hashmap to store index, sum values.
        map.put(0,-1); // This value is added to avoid a sum of zero, avoid repeated numbers
        
        for(int i=0;i<nums.length;i++)
        {
             sum += nums[i];
            
            if(k!=0) //Only if k is non-zero do this
            sum = sum%k; //Take the modulo of sum uptil now.
            if(map.containsKey(sum))
            {
                if((i - map.get(sum) )> 1) // check if more than 1 number form the sum multiple of k.
                {
                    return true;
                }
            }
            else
            {
                map.put(sum,i);
            }
        }
        
        return false;//such a subarray sum doesn't exists
    }
}
