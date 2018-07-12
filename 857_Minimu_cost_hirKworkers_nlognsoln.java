class Solution {
    public double mincostToHireWorkers(int[] q, int[] w, int K) {
        double[][] workers = new double[q.length][2]; //N times 2 array.
        for (int i = 0; i < q.length; ++i)
            workers[i] = new double[]{(double)(w[i]) / q[i], (double)q[i]}; //For every worker store wage/quality and quality value.
        Arrays.sort(workers, (a, b) -> Double.compare(a[0], b[0])); //Sort the workers based on wage/quality value
        double res = Double.MAX_VALUE, qsum = 0;
        PriorityQueue<Double> pq = new PriorityQueue<>(); //Initialize a Priority Queue...
        //For every worker, find the qual_sum
        for (double[] worker: workers) {
            qsum += worker[1];
            pq.add(-worker[1]);
            if (pq.size() > K) qsum += pq.poll();
            if (pq.size() == K) res = Math.min(res, qsum * worker[0]);
        }
        return res;
    }
}
