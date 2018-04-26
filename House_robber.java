class Solution {
    public int rob(int[] nums) {
        int prevNo =0, prevyes =0;
        
        for(int n:nums)
        {
            int temp = prevNo;
           // System.out.println("temp=" + temp);
            prevNo = Math.max(prevNo, prevyes);
            //System.out.println("prevno="+ prevNo);
            prevyes = n + temp;
            //System.out.println("prevyes="+prevyes);
        }
        
        return Math.max(prevNo, prevyes);
    }
}
