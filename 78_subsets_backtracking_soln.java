class Solution {
    public static void backTrackSubset(int[] num,List<List<Integer>> powerSet, List<Integer> temp, int start){
    	powerSet.add(new ArrayList<>(temp));
    	for (int i = start; i < num.length; i++) {
			temp.add(num[i]);
			backTrackSubset(num, powerSet, temp, i+1);
			temp.remove(temp.size()-1);
		}
    }
	
	public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> powerSet = new ArrayList<>();
        backTrackSubset(nums, powerSet, new ArrayList<>(), 0);
        return powerSet;
    }
}
