//O(n) time complexity and O(n) space complexity.
class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1) return s; //if only one row, then return the input string.

        List<StringBuilder> rows = new ArrayList<>(); //create a list of stringbuilder.
        for (int i = 0; i < Math.min(numRows, s.length()); i++) //min of str len and numRows to form
            rows.add(new StringBuilder());

        int curRow = 0; //start from row-0
        boolean goingDown = false; //going donw is false or true. Initially set to false...

        //For every character in string s, find the current StringBuilder & append to that row.
        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown; //If first row or last row, just invert the boolean goingDown variable
            curRow += goingDown ? 1 : -1; //Based on goingDown flag, update the curRow +=1 or currow -=1
        }

        StringBuilder ret = new StringBuilder(); //create a new string from list of stringbuilders and return that.
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();
    }
}
