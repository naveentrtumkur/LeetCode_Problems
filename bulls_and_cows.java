// Bulls -- Character exitss and at the exact position required.
// Cows -- Charcter exists but not at the position required.

// If it's a Bull, just increment the bull_count
// IF it's a cow, store the count in an array and continue.

class Solution {
    public String getHint(String secret, String guess) {
        int bull = 0, cow = 0;
        int[] count = new int[10];
        
        int len = secret.length();
        for(int i=0;i<len;i++)
        {
            int s = secret.charAt(i)-'0';
            int g = guess.charAt(i)-'0';
            if(s == g)
                bull++;
            else
            {
                if(count[s] < 0)
                    cow++;
                if(count[g]>0)
                    cow++;
                
                count[s]++; // Mark as digit available from secret key.
                count[g]--; // Mark as digit vissited/seen from the secret key.
            }
        }
        
        return bull+"A"+cow+"B";
    }
}
