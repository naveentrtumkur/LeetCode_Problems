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
                sum += searchNum(i,max,update);
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
			return count;
		}

		for (int i = 0; i < 10; i++) {
			if (!update[i]) {
				update[i] = true;
				long cur = 10 * prev + i;
				count += searchNum(cur, max, update);
				update[i] = false;
			}
		}

		return count;
        
    }
}
