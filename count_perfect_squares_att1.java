class Solution {
    public int numSquares(int n) {
        //Counter to maintain the number of perfect squares required.
        int count =0;
        while(n>0)
        {
            if(Math.sqrt(n) == 0)//  && count!=0)
            { 
                count++;
                break;
            }
          
            count++;
            int temp = (int) (Math.sqrt(n));
            
            n = n - (temp*temp);
            System.out.println("count="+count+"temp="+temp+"n="+n);
        }
        
    return count;
    }
}
