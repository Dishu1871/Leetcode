class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        if(n<=1)return intervals;
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        List<int[]>merged=new ArrayList<>();
        int []currinterval=intervals[0];
        merged.add(currinterval);
        for(int []curr:intervals){
            int currend=currinterval[1];
            int start=curr[0];
            int end=curr[1];
            if(start<=currend){
                currinterval[1]=Math.max(end,currend);
            }
            else{
                currinterval=curr;
                merged.add(curr);
            }
        }
        return merged.toArray(new int[merged.size()][]);
        
    }
}