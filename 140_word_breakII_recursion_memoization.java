// Bruteforce Recursive Soln with memoization using HashMap
// Time : O(n3) Space: O(n3)

//Other approaches: backtracking and DP soln.
 class Solution {

    public List<String> wordBreak(String s, List<String> wordDict) {
        return word_Break(s, wordDict, 0); //Call teh recursive word_break_fucntion
    }
    HashMap<Integer, List<String>> map = new HashMap<>(); // HashMap used to store intermediate results.

    public List<String> word_Break(String s, List<String> wordDict, int start) {
        if (map.containsKey(start)) {
            return map.get(start); //If Substring already computed return that.
        }
        
        LinkedList<String> res = new LinkedList<>();
        if (start == s.length()) {
            res.add("");
        }
        //Recursive calls to find all teh substrings
        for (int end = start + 1; end <= s.length(); end++) {
            if (wordDict.contains(s.substring(start, end))) {
                List<String> list = word_Break(s, wordDict, end);
                for (String l : list) {
                    res.add(s.substring(start, end) + (l.equals("") ? "" : " ") + l); // sentence consytructed and added.
                }
            }
        }
        map.put(start, res);
        return res;
    }
}
