// Combination sum question.
// The tricky part is to consider the repeated elements...
// Backtracking soln.

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

    List<List<Integer>> list = new ArrayList<>(); // use a list of listz
    Arrays.sort(candidates); //sort the input array
    backtrack(list, new ArrayList<>(), candidates, target, 0); //call the backtrack function...
    return list; //return the reached answer..
}

// This is the function which performs backtracking.
private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
    if(remain < 0) return;
    else if(remain == 0) list.add(new ArrayList<>(tempList));
    else{ 
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            //recursively call the backtrack function..
            backtrack(list, tempList, nums, remain - nums[i], i); // not i + 1 because we can reuse same elements
            tempList.remove(tempList.size() - 1);
        }
    }
}
}
