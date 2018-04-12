// Second naive solution by using sets.
// A set doesn't allow duplicates to be inserted.
// When. we try to insert an element, if that element already exists, return the element as duplicate.

// Proof usign pigeon hole principle.

class Solution {
    public int findDuplicate(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        
        for(int n:nums)
        {
            if(!set.contains(n))
            set.add(n);
            //else this would be the duplicate element.
            else
                return n;
        }
        
        //if there wasn't any match found, return -1;
        return -1;
        
    }
}
