// Simple Short Solution using following idea:
// Total Area = Area of left rectangle - Area of overlap portion + Area of right rectangle
// Return the calculated area.

class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        
        // Calculate the co-ordinates of the intersection.
        int left = Math.max(A, E);
        int right = Math.max(Math.min(C,G), left);
        int bottom = Math.max(B, F);
        int top = Math.max(bottom, Math.min(D, H));
        
        // Calculate the area and return.
        return (C - A) * (D - B) - (right -left) * (top - bottom) + (G - E) * (H - F);
    }
}
