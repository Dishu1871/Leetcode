class Solution {
    int mod =1000000007;
    public int maxSum(List<Integer> nums, int k) {
        int bitstore[]=new int[32];
        for(int num:nums){
            for(int b=0;b<32;b++){
                if((num & (1<<b))!=0){
                    bitstore[b]++;
                }
            }
        }
        long result=0;
        while(k-->0){
            long curr=0;
            for(int b=0;b<32;b++){
                if(bitstore[b]>0){
                    curr=curr|(1<<b);
                    bitstore[b]--;
                }
            }
            result=(result+(curr*curr)%mod)%mod;
        }
        return (int)result;
    }
}