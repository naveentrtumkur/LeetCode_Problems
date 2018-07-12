//HashMap Solution to find teh answer.

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        //Create a HashMap to store the visited elements from the array.
        Map<Integer, Integer> map = new HashMap<>(); //Store the key & index of that element.
        for(int i=0; i < numbers.length; i++) //traverse from the first to last element in the array
        {
            int cur = target - numbers[i];
            if(!map.containsKey(cur))// && (map.get(cur)!=i))
                map.put(numbers[i], i); //insert the res to target and index .
            else{
                res[0] = i+1;
                res[1] = map.get(cur)+1;
            }
        }
        
        return  res;
    }
}
