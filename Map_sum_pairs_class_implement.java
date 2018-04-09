/*
Implement a MapSum class with insert, and sum methods.

For the method insert, you'll be given a pair of (string, integer). The string represents the key and the integer represents the value. If the key already existed, then the original key-value pair will be overridden to the new one.

For the method sum, you'll be given a string representing the prefix, and you need to return the sum of all the pairs' value whose key starts with the prefix.

Example 1:
Input: insert("apple", 3), Output: Null
Input: sum("ap"), Output: 3
Input: insert("app", 2), Output: Null
Input: sum("ap"), Output: 5

*/


class MapSum {

    /** Initialize your data structure here. */
    Map<String, Integer> map;
    public MapSum() {
        //Initialisation of a map.
         map = new HashMap<>();
        
    }
    
    public void insert(String key, int val) {
        // If the key already exists, then replace the value, else insert the key-val pair. 
        if(map.containsKey(key))
            map.replace(key,val);
        else
            map.put(key,val);
    }
    
    public int sum(String prefix) {
        
        //create an Iterator to map and get sum of all key-patterns which matches prefix.
        int sum =0;
        
        for(Map.Entry<String, Integer> entry : map.entrySet())
        {
            String str = entry.getKey();
            int val = entry.getValue();
            
            if(str.startsWith(prefix))
                sum+= val;
        }
        
        //return the final calculated sum value.
        return sum;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */
