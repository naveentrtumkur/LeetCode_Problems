// The idea is to loop from i=0:1<<n
// the formula is to xor i with rightshifted by 1.
// This would arrive at the solution which can be stored in a list.

class Solution {
   public List<Integer> grayCode(int n) {
    List<Integer> result = new LinkedList<>();
    for (int i = 0; i < 1<<n; i++) result.add(i ^ i>>1);
    return result;
}
}
