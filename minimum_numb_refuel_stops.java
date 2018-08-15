/** The solution can be thought of as follows:
    - Sort the stations based on the distance in ascending order i.e stations[i][0]. Use java's comparator interface
    - Then keep track of prev stations fuel.
    - If we can reach a fuel station fine proceed. If we cannt, just get the entry from priorityQueue and add to fuel.
    - If anytime you cant reach a station an fuel falls below o return -1. Unable to reach target.
*/
class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
            int current = startFuel, refill = 0;
            // Sort the Queue based on the gas values and add them
            Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //Reverse teh priority queue.
                                                   /* {
                                                        public int compare(int[][] a, int[][] b)
                                                        {
                                                            return a[0][0] - b[0][0];
                                                        }
                                                    });*/
            for (int[] station : stations) {
            // check if we can reach this station, else refuel the gas from the previous station 
            //repeat the operation
            while (current < station[0]) {
                if (pq.isEmpty()) 
                    return -1; // if we reful and cannot reach a particular station return -1.
                int pol1 = pq.poll();
                //System.out.println("p1===="+pol1);
                current += pol1;
                refill++;
            }
            pq.offer(station[1]); //if we can visit push the gas value onto the queue
        }
        // At last station check if we can reach the target
        while (current < target) {
            if (pq.isEmpty()) 
                return -1;
            int pol2 = pq.poll();
            //System.out.println("p2=="+pol2);
            current = current+ pol2;
            refill++;
        }
        return refill;
    }
}
