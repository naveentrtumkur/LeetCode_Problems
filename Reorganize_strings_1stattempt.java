class Solution {
    public String reorganizeString(String S) {
        //Create a hashmap to store the count of characters
        Map<Character,Integer> map = new HashMap<>();
        
        //Calculate the length of the input string
        int len = S.length();
        
        //Put all the characters and their frequency onto hashmap
        for(int i=0;i<len;i++)
        {
            if(map.containsKey(S.charAt(i)))
                map.replace(S.charAt(i),map.get(S.charAt(i))+1);
            else
                map.put(S.charAt(i),1);
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!map.isEmpty())
        {
        //int max = Integer.MIN_VALUE;
        //char maxChar=S.charAt(0);
        for(Map.Entry<Character,Integer> temp:map.entrySet())
        {
            sb.append(temp.getKey());
            if(temp.getValue() == 1)
                map.remove(temp.getKey());
            else
                map.replace(temp.getKey(),temp.getValue()-1);
            //System.out.println(temp.getKey());
            //System.out.println(temp.getValue());
            /*if(max < temp.getValue())
            {
                max = temp.getValue();
                maxChar = temp.getKey();
            }*/
        }
            
            /*System.out.println("maxValue="+map.get(maxChar));
            int val = map.get(maxChar);
            for(int j=0;j< val;j++)
            {
                sb.append((maxChar));
            }
            map.remove(maxChar);*/
        }
        return sb.toString();
    }
}
