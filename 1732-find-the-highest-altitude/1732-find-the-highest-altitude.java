class Solution {
    public int largestAltitude(int[] gain) {
        int ans=0,sum=0;
        for(int n:gain){
            sum+=n;
            if(sum>0){
                ans=Math.max(ans,sum);
            }
        }
        return ans;
    }
}