// Approach-1: Sort the array and find teh longest conescutive number)streak which can be formed from the input array.
// Complexity: O(nlogn) time and O(1) space if array sorted in place else O(n) space complecity. 

// Try thinking of O(n) solution. 
// approach-2: Imporvised solution based on Bruteforce by using HashSets and smart lookups.
// Time: O(n+n) ~ O(n) and Space: O(n) for HashSets
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>();
        for (int num : nums) {
            num_set.add(num);
        }

        int longestStreak = 0;

        // Find the smallest number and check if every numb+1 element exists in the HashSet.
        for (int num : num_set) {
            if (!num_set.contains(num-1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (num_set.contains(currentNum+1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak; //return the longest streak element possible.
    }
}
