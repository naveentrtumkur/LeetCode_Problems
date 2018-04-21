// DFS approach to solve this problem.

class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        
        //Call the dfs function to calculate the path to target.
        // This would be like a helper function.
        addPath(graph, res, 0, new ArrayList<>());
        return res;
    }
    
    public void addPath(int[][] graph,List<List<Integer>> res, int node, List<Integer> list)
    {
        list.add(node);
        
        //if the node is last node, add to res and return
        if(node == graph.length-1)
        {
            res.add(new ArrayList(list));
            return;
        }
        
        //else keep find every neighbor of the cuurent node.
        // This would be like the dfs traversal.
        for(int neighbor: graph[node])
        {
            //list.add(neighbor);
            addPath(graph,res,neighbor,list);
            list.remove(list.size()-1);
        }
    }
}
