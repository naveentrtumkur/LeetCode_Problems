/*

Given a list of non negative integers, arrange them such that they form the largest number.

For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.

Note: The result may be very large, so you need to return a string instead of an integer.

*/


class Solution {
    //customized comparator implementation.
    private class customComparator implements Comparator<String>
    {
        public int compare(String a, String b)
        {
            String i = a+b;
            String j = b+a;
            return j.compareTo(i);
        }
    }
    
    public String largestNumber(int[] nums) {
        // Since the result needs to return a string, get the nums and convert them to string.
        // Store the result in an array of strings.
        String[] ar = new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ar[i] = String.valueOf(nums[i]);
        }
        
        // Sort the array and use your customized comparator.
        Arrays.sort(ar, new customComparator());
        
        // Th enumbers are sorted. One corner case, if the highest number is 0, return 0.
        if(ar[0].equals("0"))
        {
           // System.out.println("Inside first if");
            return "0";
        }
        //if(ar[0] == "0")
        //    System.out.println("Inside second if");
        //Create a string Builder to return the newly created string.
        StringBuilder sb = new StringBuilder();
        for(String s:ar)
        {
            sb.append(s);
        }
        
        return sb.toString();
    }
}
