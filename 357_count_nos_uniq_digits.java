// Solution using backtracking technique.
// If we observe the pattern we find it is kind of a combination problem.

class Solution {
   
    public int countNumbersWithUniqueDigits(int n) {
        //If n greater than 10, set it back to 10.
        if(n>10)
        {
            n=10;
        }
        
        if(n==0)
            return 1;
        
        boolean[] update = new boolean[10];
        long max = (long) (Math.pow(10,n));
        int sum = 1;
        for(int i=1;i<10;i++)
        {
            if(!update[i])
            {
                update[i] = true;
               
                    int val = searchNum(i,max,update);
                  sum += val;
                //System.out.println("Sum = "+val);
                update[i] = false;
                
            }
        }
        
        return sum;
    }
    
    public int searchNum(long prev, long max, boolean[] update)
    {
        int count = 0;
		if (prev < max) {
			count += 1;
		} else {
             //System.out.println("count="+count);
			return count;
           
		}

		for (int i = 0; i < 10; i++) {
			if (!update[i]) {
				update[i] = true;
               // System.out.println("prev="+prev);
				long cur = 10 * prev + i;
               // System.out.println("cur="+cur);
                //System.out.println("cur="+cur);
				count += searchNum(cur, max, update);
				update[i] = false;
			}
		}

        //System.out.println("Just before="+count);
		return count;
        
    }
}
