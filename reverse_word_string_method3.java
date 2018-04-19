// W/O split and without reverse function.

// Method 3 without using reverse and split function.

public class Solution {
    public String reverseWords(String s) {
       String[] r = split(s);
        StringBuilder sb = new StringBuilder();
       for(String st:r)
       {
           st = reverse(st);
           sb.append(st+"");
       }
        
        //Print the string 
        //System.out.println("res="+sb.toString());
        return sb.toString().trim();
    }
    
    public String[] split(String str)
    {
       List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            //if not a space
            if(str.charAt(i)!=' ')
            {
                sb.append(str.charAt(i));
            }
            else
            {
                list.add(sb.toString()+" ");
                sb = new StringBuilder();
            }
        }
        list.add(sb.toString()+" ");
        return list.toArray(new String[list.size()]);
    }
    
    public String reverse(String st)
    {
        //Normal function to reverse a string using StringBuilder.
        StringBuilder sb = new StringBuilder();
       // int j = st.length()-1;
        for(int i=0; i<st.length();i++)
        {
            sb.insert(0,st.charAt(i));
            //j--;
            
        }
        return sb.toString();
    }
} 
