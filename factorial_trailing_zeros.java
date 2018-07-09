// My approach is calculate the factorial convert it to string and findd the number of zeroes.

class Solution {
    public int trailingZeroes(int n) {
        int numb = 1;
        for(int i=1;i<=n;i++)
        {
            numb = numb * i;
        }
        
        //System.out.println("Number = "+numb);
        System.out.println(Integer.toString(numb));
        String str = Integer.toString(numb);
        int i = str.length()-1;
        int count = 0;
        while(i >=0 && (str.charAt(i)-'0' == 0) )
        {
            //System.out.println("i="+i);
            count++;
            i--;
        }
        return count;
    }
}
