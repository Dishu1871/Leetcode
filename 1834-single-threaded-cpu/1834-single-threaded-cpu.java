class Solution {
    public int[] getOrder(int[][] tasks) {
        int n=tasks.length;
        int []ans=new int[n];
        int sortedtask[][]=new int[n][3];
        for(int i=0;i<n;i++){
            sortedtask[i][0]=tasks[i][0];
            sortedtask[i][1]=tasks[i][1];
            sortedtask[i][2]=i;
        }
        Arrays.sort(sortedtask,(a, b)->Integer.compare(a[0], b[0]));
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->{
            if(a[1]!=b[1]){
                return Integer.compare(a[1],b[1]);
            }
            return  Integer.compare(a[2],b[2]);
        });
        long currtime=0;
        int currindex=0;
        int resultindex=0;
        while(resultindex<n){
            if(pq.isEmpty() && currtime<sortedtask[currindex][0]){
                currtime=sortedtask[currindex][0];
            }
            while(currindex<n && sortedtask[currindex][0]<=currtime){
                pq.offer(sortedtask[currindex]);
                currindex++;
            }
            int []currtask=pq.poll();
            currtime+=currtask[1];
            ans[resultindex++]=currtask[2];
        }
        return ans;
    }
}