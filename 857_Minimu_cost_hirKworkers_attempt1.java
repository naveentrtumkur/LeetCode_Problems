class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int K) {
        int N = quality.length; //Number of people count
        double ans = 1e9; //assign answer to some high int valuee.

        //Traverse for every person..
        for (int captain = 0; captain < N; ++captain) {
            // We need to give atleast wage[captain] / quality[captain] per qual
            double factor = (double) wage[captain] / quality[captain]; //calculate the factor..
            double prices[] = new double[N];
            int t = 0;
            for (int worker = 0; worker < N; ++worker) {
                double price = factor * quality[worker];
                if (price < wage[worker]) continue;
                prices[t++] = price;
            }

            if (t < K) continue; //If t value < K then skip further things.
            Arrays.sort(prices, 0, t); //sort the array according to prices in ascending order.
            double cand = 0;
            for (int i = 0; i < K; ++i)
                cand += prices[i]; // Choose a candidate
            ans = Math.min(ans, cand); //Finding the minimum cost considering all possible options..
        }

        return ans;
    }
}
