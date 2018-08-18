// Using the Max-heap to store first half of elements and MinHeap to store second half of the elements.
// Approach using two heaps. Insertion: O(logn) and median: O(1)

class MedianFinder {

    /** initialize your data structure here. */
    public MedianFinder() {
        
    }
     // max queue is always larger or equal to min queue
    PriorityQueue<Integer> minQ = new PriorityQueue();
    PriorityQueue<Integer> maxQ = new PriorityQueue(1000, Collections.reverseOrder());
    public void addNum(int num) {
        maxQ.offer(num);
        minQ.offer(maxQ.poll());
        
        //if teh size of maxQ < minQ, push the element from min to maxQ
        if(maxQ.size() < minQ.size())
            maxQ.offer(minQ.poll());
    }
    
    public double findMedian() {
        return maxQ.size() == minQ.size()? (maxQ.peek() + minQ.peek())/2.0: maxQ.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
