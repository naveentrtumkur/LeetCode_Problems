// Solution: Use a HashMap to store the key and count(frequency) of occurance.
// Check the highest frequency word, if it's banned go to next word.
// Else return that as the highest frequency word.

// This is a tricky question so do the following: 
// - remove the punctuations - convert upper -> lower
// - return the string with highest frequency that's not in the banned list

// Another approach, check charcter by charcter till it's not alphabet, form words without punctaution and all lower case.
// Construct the HashMap and return the string with the highest count.

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        Set<String> ban = new HashSet<>(Arrays.asList(banned)); // Create a HashSet to store all the banned Strings.
        Map<String, Integer> count = new HashMap<>(); // hashMap to store string, frequency
        String[] words = paragraph.replaceAll("\\pP" , "").toLowerCase().split("\\s+"); //Convert all the punctuation to null and convert all upper -> lower case
        
        for (String w : words) if (!ban.contains(w)) count.put(w, count.getOrDefault(w, 0) + 1); // for every string, update the hasmap changing it's count. Make sure it's not banned word.
        
        return Collections.max(count.entrySet(), Map.Entry.comparingByValue()).getKey(); // Return the max frequency word.
    }
}
