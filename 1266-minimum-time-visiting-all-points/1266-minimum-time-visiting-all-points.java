class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int distance = 0;
        for(int i=1;i<points.length;i++)
        {
            int a = points[i-1][0];
            int b = points[i-1][1];
            int x = points[i][0];
            int y = points[i][1];
            distance+=Math.max(Math.abs(a-x),Math.abs(b-y));
             System.out.println(distance);
        }
        return distance;
    }
}