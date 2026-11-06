class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        int len=logs.length;
        Arrays.sort(logs,(a,b)->{
            return a[1]-b[1];
        });
        int query[][]=new int[queries.length][2];
        for(int i=0;i<queries.length;i++){
            query[i][0]=queries[i];
            query[i][1]=i;
        }
        Arrays.sort(query,(a,b)->{
            return a[0]-b[0];
        });
        int res[]=new int[queries.length];
        Map<Integer,Integer>mp=new HashMap<>();
        int i=0;
        int j=0;
        for(int pair[]:query){
            int currtime=pair[0];
            int index=pair[1];
            int start=currtime-x;
            int end=currtime;
            while(j<len&& logs[j][1]<=end){
                int serverid=logs[j][0];
                mp.put(serverid,mp.getOrDefault(serverid,0)+1);
                j++;
            }
            while(i<len && logs[i][1]<start){
                 int serverid=logs[i][0];
                mp.put(serverid,mp.getOrDefault(serverid,0)-1);
                if(mp.get(serverid)==0){
                    mp.remove(serverid);
                }
                i++;
            }
            res[index]=n-mp.size();
        }
        return res;
    }
}