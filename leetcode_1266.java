//1266
//Minimum Time Visiting all points
/*On a 2D plane, there are n points with integer coordinates points[i] = [xi, yi]. Return the minimum time in seconds to visit all the points in the order given by points.

You can move according to these rules:

In 1 second, you can either:
move vertically by one unit,
move horizontally by one unit, or
move diagonally sqrt(2) units (in other words, move one unit vertically then one unit horizontally in 1 second).
You have to visit the points in the same order as they appear in the array.
You are allowed to pass through points that appear later in the order, but these do not count as visits. */
import java.util.*;
class leetcode_1266 {
    public static int minTimeToVisitAllPoints(int[][] points) {
        int total = 0;
     
        int n = points.length;
       
        for(int i=0;i<n-1;i++){

            int x1 = points[i][0];
            int y1 = points[i][1];

            int x2 = points[i + 1][0];
            int y2 = points[i + 1][1];

            int diff = Math.max(Math.abs(x2 - x1), Math.abs(y2 - y1));

            total += diff;
            
        }
        return total;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
         int n = sc.nextInt();

        int[][] points = new int[n][2];

      
        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt(); // x
            points[i][1] = sc.nextInt(); // y
        }

        int result = minTimeToVisitAllPoints(points);

        System.out.println(result);
    }
}