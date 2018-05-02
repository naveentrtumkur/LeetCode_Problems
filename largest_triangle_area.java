// Given a set of points, find teh area of teh laregst triangle that can be formed out of it.

//Brute-force approach to calculate area between every three points.
// Calculate a formual to calculate area of a triangle using 3-points

//Area = 1/2 x (x0y1 + y0z1 + z0x1 - x0z1 - x1y0 - x2y1)

class Solution {
    public double largestTriangleArea(int[][] points) {
        int len = points.length;
        double maxArea = 0;
        // Loop through 3 loops to calculate the area of the triangle.
        for(int i = 0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                for(int k=j+1;k<len;k++)
                {
                    maxArea = Math.max(maxArea, calArea(points[i],points[j],points[k]));
                }
            
            }
        }
        return maxArea;
    }
    
    public double calArea(int[] a, int[] b, int[] c)
    {
        return 0.5*Math.abs(a[0]*b[1] + b[0] * c[1] + c[0] * a[1] - a[0] * c[1] - b[0] * a[1] - c[0] *  b[1]);
    }
}
