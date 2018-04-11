// My solution is similar to finding th enumber of islands that exists.
// Do not alter the original array. USe a visited boolean array to note the nodes visited.
// left,right,bottom and top is one? traverse them and mark them as visited.

class Solution { 
   
     public void dfsTraverse(int i, int[][] M, boolean[] visited )
    {
          // row-wise traversal.
        for(int j=0;j<M.length;j++)
        {
         if(!visited[j] && M[i][j] == 1)
         {
        
            visited[j] = true;
             dfsTraverse(j, M, visited);
         }
        }
     }
         
    public int findCircleNum(int[][] M) {
        int friendCount =0;
        boolean[] visited = new boolean[M.length];
        //columnwise traversal to find teh count of circle of friends.
        for(int i=0;i<M.length;i++)
        {
            // if teh row/column is unvisited
               if(!visited[i])
               {
                    
                    dfsTraverse( i,M, visited);
                    friendCount++;
               }
        }
        
        // return teh friend count value that's calculated.
        return friendCount;
    }
    
   
    }

//kind of Dfs approach to wolve this problem.
