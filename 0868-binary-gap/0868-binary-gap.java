class Solution {
    public int binaryGap(int n) {
       int curr=Integer.MIN_VALUE;
       int prev=curr;
       int ans=0;
       int i=0;
       while(n>0){
        if((n&1)==1){
            prev=curr;
            curr=i;
            if(prev!=Integer.MIN_VALUE){
                ans=Math.max(ans,Math.abs(curr-prev));
            }
        }
        i++;
        n>>=1;
       } 
       return ans;
    }
}