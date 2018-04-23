//WAP to find if a square is valid using Java

class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
       int[][] p= {p1,p2,p3,p4};
        
        //Sorting by using lambda expression.
        Arrays.sort(p, (l1,l2)->(l1[0]==l2[0])? l1[1]-l2[1]:l1[0]-l2[0]);
        
        return (calculateSide(p[0],p[1])!=0 && calculateSide(p[0],p[1]) == calculateSide(p[1],p[3]) && calculateSide(p[3],p[2]) == calculateSide(p[2],p[0]) && calculateSide(p[0],p[3]) == calculateSide(p[1],p[2]));
        
    }
    
    public double calculateSide(int[] p1, int[] p2)
    {
        int x1 = p1[0], y1 = p1[1];
        int x2 = p2[0], y2 = p2[1];
        //System.out.println("x1="+x1+"y1="+y1+"x2="+x2+"y2="+y2);
        // From debugging got to know that I need to use Math.abs to calculate teh absolute value when finding th esquare root.
        double dist = Math.sqrt(Math.abs(((y2-y1)*(y2-y1)) + ((x2-x1)*(x2-x1))));
        //System.out.println("DIst="+dist);
        return dist;
    }
}
