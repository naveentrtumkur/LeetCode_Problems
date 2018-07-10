//Find the intersection of two Arrays.

// Just use a HashMap to store the greater array.
// If a match is found, remove from hashSet and add to list of nos to be returned.
// Else proceed till all teh elemenets are traversed.

class Solution {
    int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>(); //Declare a HashMap
        List<Integer> result = new ArrayList<>(); //Declare an arraylist to store output elements
        for(int i = 0; i < nums1.length; i++)
        {
            if(map.containsKey(nums1[i])) 
                map.put(nums1[i], map.get(nums1[i])+1); //If map already contains then increment count
            else 
                map.put(nums1[i], 1); // else insert into the map
        }
    
        //Traverse through the HashMap. If the element is present add it to list else proceed.
        for(int i = 0; i < nums2.length; i++)
        {
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) //You can do that or remove the entry from map.
            {
                result.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i])-1);
            }
        }
    
        //create an array and return the array
       int[] res = new int[result.size()];
       for(int i = 0; i < result.size(); i++)
       {
           res[i] = result.get(i);
       }
    
       return res; //return the res
    }
}
