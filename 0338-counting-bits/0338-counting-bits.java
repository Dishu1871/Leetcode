class Solution {
    int solve(int n){
        int cnt=0;
        while(n>0){
            if((n&1)==1)cnt++;
            n>>=1;
        }
        return cnt;
    }
    public int[] countBits(int n) {
        int []ans=new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i]=solve(i);
        }
        return ans;
    }
}