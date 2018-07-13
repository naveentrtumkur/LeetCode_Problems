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
