// SOlution usign Quick Sleelct
// O(n) solution and worst case of O(n2)

class Solution {
    public int minMoves2(int[] A) {
    int sum = 0, median = quickselect(A, A.length/2+1, 0, A.length-1);
    // Traverse from the beginning to the end of teh array to find minimum moves required.    
    for(int i=0;i<A.length;i++)
    {
        sum += (int)Math.abs(A[i]-median);
        
    }
        return sum;
        }
    
    public int quickselect( int[] arr, int k, int start, int end)
    {
        int l = start,  r= end , pivot = arr[(l+r)/2];
        while(l<=r)
        {
            while(arr[l] < pivot)
                l++;
            while(arr[r]>pivot)
                r--;
            if(l>=r)
                break;
            swap(arr, l++, r--);
        }
        
        if(l-start+1 >k)
           return quickselect(arr,k,start,l-1);
        if(l == r && l-start+1 == k)
            return arr[l];
        //when the k value if towards left half. i.e l/r<k
        return quickselect(arr, k -r+start-1, r+1,end);
    }
    
    public void swap( int[] arr, int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
