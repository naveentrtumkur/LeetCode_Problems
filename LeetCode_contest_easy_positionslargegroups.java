class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> res = new ArrayList<>();
        int count =1;
        for(int i=0;i<S.length()-1;)
        {
            int j = i+1;
            while( j<S.length() && S.charAt(i) == S.charAt(j) )
            {
                count++;
                j++;
            }
            List temp = new ArrayList<>();
            if(count>=3)
            {
            temp.add(i);
            temp.add(j-1);
                res.add(temp);
            }
            i+=count;
            count=1;
        
        }
        
        return res;
    }
}
