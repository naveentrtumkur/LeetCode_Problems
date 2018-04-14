// My solution is to construct a Map of key value being used and 
// The value i.e number of positions that can take up this element.

class Solution {
    // A counter to maintain the number of beautiful arrangements.
    int count =0;
    public int countArrangement(int N) {
        boolean[] visited = new boolean[N+1];
        //int i;
        //for(i=1;i<=N;i++)
            permute(N,1,visited);
        return count;
       
    }
    
    public int permute(int N, int pos, boolean[] visited)
    {
        if(pos > N)
            count++;
        int i;
        for(i=1;i<=N;i++)
        {
            if(!visited[i] && (i%pos == 0 || pos%i == 0))
            {
                visited[i] = true;
                permute(N, pos+1,visited);
                visited[i] = false;
            }
        }
        return count;
    }
    
}
