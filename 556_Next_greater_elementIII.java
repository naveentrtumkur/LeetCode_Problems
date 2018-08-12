//Approach-1: Brute force approach is to convert the number into string and find every permuattion and choose the next greater among them. Time: O(n!) and space O(n!). This is n't an efficient approach.

//Approach#2: Observing the pattern we arrive at a sitauation where if we see descending numbers string, no combination is greater than this.
//- Scan from right. Find the number where nums[i] < nums[i+1]. Start from right again and find a "j" such that a[j] > a[i].Swapm them . Now reverse ythe numbers from i+1 to len such that next greater number would be formed...
//TIme:O(n) and space:O(n)
public class Solution {
    public int nextGreaterElement(int n) {
        char[] arr = (""+n).toCharArray(); //convert it to string and form a character array out of that..
        //Fix a pointer i to end -2
        int i = arr.length  - 2;
        while(i>=0 && arr[i]>=arr[i+1])
        {
            i--;
        }
        
        //Check if i has gone below 0th index element
        if(i<0)
            return -1; //Return failure in this case.
        
        int j = arr.length-1;
        while(arr[j] <= arr[i])
            j--;
        
        //Now we have found a number just greater than ith number. So swap i and j....
        swap(arr,i,j);
        
        // We have found next greater digit and placed it at "i", but numbers after i aren't smallest.
        // Reverse them so that we arrive at the smallest number.
        
        reverse(arr,i+1);
        
        //for(int k:arr)
        //System.out.println(k);
        
        try {
            return Integer.parseInt(new String(arr));
        } catch (Exception e) {
            return -1;
        }
        }
    private void reverse(char[] a, int start) {
        int i = start, j = a.length - 1;
        while (i < j) {
            swap(a, i, j);
            i++;
            j--;
        }
    }
    private void swap(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
