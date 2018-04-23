/*
Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k), where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h. Write an algorithm to reconstruct the queue.

*/


class Solution {
    public int[][] reconstructQueue(int[][] people) {
        // Check if input is null, return null.
        
        if(people ==null || people.length == 0)
            return new int[0][0];
        
        //Sort the people array based on descending order. You need to override the comparator interface.
        Arrays.sort(people, new Comparator<int[] >(){
            public int compare(int[]a1, int[] a2){
            if(a1[0] == a2[0])
                return a1[1] -a2[1];
            else
                return a2[0] - a1[0];
            }
        });
        
        List<int[]> res = new LinkedList<>();
        // after this create a Linked list by updating and inserting in between two small and big boundary values.
        for(int[] p:people)
        {
            res.add(p[1],p);
        }
        
        // return the finally reconstructed queue.
        return res.toArray(new int[people.length][]);
        
    }
}
