class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long ans=0;
        int n=happiness.length;
        int p=0;
        for(int i=n-1;i>=0;i--){
            if(k==p||happiness[i]-p<0){
                break;
            }else{
                ans+=happiness[i]-p;
                p++;
            }
        }
        return ans;
    }
}