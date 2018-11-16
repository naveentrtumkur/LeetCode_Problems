v// Backtracking solution
/*
There are possibly 4 operations: + , -, * and combine/moveto next digit -- The case of 123 and target=36 it would be 12 *3 to get 36.
This combination is done for N digits and hence the complexity would be 4^N.

T(n) = 3 * T(n-1) + 3 * T(n-2) + 3 * T(n-3) + ... + 3 *T(1);
T(n-1) = 3 * T(n-2) + 3 * T(n-3) + ... 3 * T(1);
Thus T(n) = 4T(n-1);

Time complexity: O(4^n)

This problem has a lot of edge cases to be considered:

overflow: we use a long type once it is larger than Integer.MAX_VALUE or minimum, we get over it.
0 sequence: because we can't have numbers with multiple digits started with zero, we have to deal with it too.
a little trick is that we should save the value that is to be multiplied in the next recursion.

*/
 class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> rst = new ArrayList<String>(); //List of result of all possible valid operations.
        if(num == null || num.length() == 0) return rst; //Base case
        helper(rst, "", num, target, 0, 0, 0); //Call teh helper function
        return rst; //Return the possible operations.
    }
     
     // This is the helper function which would be called recursively.
    public void helper(List<String> rst, String path, String num, int target, int pos, long eval, long multed){
        if(pos == num.length()){ //Checkif pos is EOS
            if(target == eval) //If target is met add to list and backtrack considering with someother operation
                rst.add(path);
            return;
        }
        // Start from pos till the EOS
        for(int i = pos; i < num.length(); i++){
            if(i != pos && num.charAt(pos) == '0') break; //should be combined, can't be treated individually.
            long cur = Long.parseLong(num.substring(pos, i + 1));
            if(pos == 0){
                helper(rst, path + cur, num, target, i + 1, cur, cur);//If the pos = 0, then updatre the path and reurse to next index.
            }
            else{
                helper(rst, path + "+" + cur, num, target, i + 1, eval + cur , cur); //try with +
                
                helper(rst, path + "-" + cur, num, target, i + 1, eval -cur, -cur); //Try with minus
                
                helper(rst, path + "*" + cur, num, target, i + 1, eval - multed + multed * cur, multed * cur ); //tryu with *
            }
        }
    }
}
