/*
In a forest, each rabbit has some color. Some subset of rabbits (possibly all of them) tell you how many other rabbits have the same color as them. Those answers are placed in an array.

Return the minimum number of rabbits that could be in the forest.

Examples:
Input: answers = [1, 1, 2]
Output: 5
Explanation:
The two rabbits that answered "1" could both be the same color, say red.
The rabbit than answered "2" can't be red or the answers would be inconsistent.
Say the rabbit that answered "2" was blue.
Then there should be 2 other blue rabbits in the forest that didn't answer into the array.
The smallest possible number of rabbits in the forest is therefore 5: 3 that answered plus 2 that didn't.

Input: answers = [10, 10, 10]
Output: 11
*/


// I will consider using a HashMap to solve this particular problem.

// Given a possibility value "i" store it as key with i+1 as occurance.
// Once you traverse teh entire array, return the sum of values as the output.

// This output would be the minimum number of rabbits required to solve the question in hand.

class Solution {
    public int numRabbits(int[] answers) {
        
        //Create a Map to store the resultant occurances of rabbits.
        Map<Integer, Integer> map = new HashMap<>();
        
        for( int i=0; i< answers.length; i++)
        {
            if(!map.containsKey(answers[i]))
                map.put(answers[i],1);
            
            //if the entry already exists, increment the count value.
            else
                map.replace(answers[i], map.get(answers[i])+1);
        }
        
        // Create an iterator to itearte through the map and return the result.
        int minSum=0;
        for( Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            int Key = entry.getKey();
            int val = entry.getValue();
            
            int n = val/(Key+1);
            
            minSum+= val%(Key+1) == 0? n*(Key+1): (n+1) *(Key+1);
            
            
        }
        
        //return nthe minimum number of rabbits.
        return minSum;
    }
}
