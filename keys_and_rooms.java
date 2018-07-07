/****

There are N rooms and you start in room 0.  Each room has a distinct number in 0, 1, 2, ..., N-1, and each room may have some keys to access the next room. 

Formally, each room i has a list of keys rooms[i], and each key rooms[i][j] is an integer in [0, 1, ..., N-1] where N = rooms.length.  A key rooms[i][j] = v opens the room with number v.

Initially, all the rooms start locked (except for room 0). 

You can walk back and forth between rooms freely.

Return true if and only if you can enter every room.

***/

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        visited[0] = true;
        Stack<Integer> stack = new Stack();
        stack.push(0);

        //At the beginning, we have a todo list "stack" of keys to use.
        // visited contains the rooms that have been visited.
        while (!stack.isEmpty()) { // While we have keys...
            int current = stack.pop(); // Get the next key 'node'
            for (int n: rooms.get(current)) // For every key in room # 'node'...
                if (!visited[n]) { // ...that hasn't been used yet
                    visited[n] = true; // mark that we've entered the room
                    stack.push(n); // add the key to the todo list
                }
        }

        for (boolean vis: visited)  // if a room isn't been visited, return false
            if (!vis) return false;
        return true;
    }
} 
