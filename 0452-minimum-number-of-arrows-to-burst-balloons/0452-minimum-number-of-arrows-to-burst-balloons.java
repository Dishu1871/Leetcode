class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length==0)return 0;
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int arrow=1;
        int arrowlimit=points[0][1];
        for(int i=1;i<points.length;i++){
            int start=points[i][0];
            int end=points[i][1];
            if(start>arrowlimit){
                arrow++;
                arrowlimit=end;
            }
        }
        return arrow;
    }
}