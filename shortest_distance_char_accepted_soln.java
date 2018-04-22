class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] nums = new int[S.length()];
        for(int i=0;i<nums.length;i++)
            nums[i] = Integer.MAX_VALUE;
        /*Stack<Integer> stack = new Stack<>();
        
        boolean nFirst = false;
        int j =1;*/
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i) == C)
            {
                nums[i] = 0;
                int count1 =1, j=i;
                if(j-1>=0)
                    j--;
                while(j>=0 && S.charAt(j)!=C)
                {
                    nums[j] = (int) (Math.min(nums[j],count1++));
                    j--;
                }
                int k=i, count2=1;
                if(k+1<=nums.length-1)
                    k++;
                while(k<=nums.length-1 && S.charAt(k)!=C)
                {
                    nums[k] = Math.min(nums[k], count2++);
                    k++;
                }
            }
                
            }
                return nums;
        }
}
