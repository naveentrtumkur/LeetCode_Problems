class MovingAverage {

    /** Initialize your data structure here. */
    //Initing our Datastructure
    double sum = 0.0; //init the sum value of all elements
    Queue<Integer> queue;
    int max_size; // The max size of elements that can be stored in the queue.
    public MovingAverage(int size) {
        queue = new LinkedList<>();
        max_size = size; //Init the max size
    }
    
    public double next(int val) {
        //If it's max_size, remove the last entry...
        if(queue.size() == max_size)
            sum = sum - queue.remove();
        
        sum += val;
        queue.add(val);
        double avg_sum = sum/queue.size(); //Calculate the moving average value.
        return avg_sum;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */

// Ok understanding the problem, the drivr call would be to initialize teh size and then start adding the elements
// --> If the size of DS == max_size remove the previous element and add the new element.

// Time : O(1) per insertion and space: O(n) we are using a queue 
