// My solution is to construct a Map of key value being used and 
// The value i.e number of positions that can take up this element.

class Solution {
    // A counter to maintain the number of beautiful arrangements.
    int count =0;
    public int countArrangement(int N) {
       int[] arr = new int[N];
        for(int i=1;i<=N;i++)
        {
            arr[i-1] = i;
        }
        //Calculate the permutation starting from the first index.
        permute(arr,0);
        return count;
       
    }
    
    public void permute(int[] arr, int pos)
    {
        if(pos == arr.length)
            count++;
        int i;
        for(i=pos;i<arr.length;i++)
        {
              swap(arr,i,pos);
             if((pos+1)%arr[pos] == 0 || arr[pos]%(pos+1) ==0)
            {
              
                permute(arr,pos+1);
                
            }
            swap(arr,i,pos);
        }
    }
    
    public void swap(int[] arr, int i, int pos)
    {
        int temp = arr[i];
        arr[i] = arr[pos];
        arr[pos] = temp;
    }
    
   }
