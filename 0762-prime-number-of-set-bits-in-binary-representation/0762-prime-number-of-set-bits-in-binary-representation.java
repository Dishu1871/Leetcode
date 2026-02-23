class Solution {
    boolean helper(int prime){
        if(prime==2 |prime==3 |prime==5 |prime==7 |prime==11 |prime==13 |prime==17 |prime==19)return true;
        return false;
    }
    int countbits(int num){
        int count=0;
        while(num>0){
            if((num&1) ==1){
                count++;
            }
            num>>=1;
        }
        return count;
    }
    public int countPrimeSetBits(int left, int right) {
        int ans=0;
        for(int i=left;i<=right;i++){
            int x=countbits(i);
            if(helper(x)){
                ans++;
            }
        }
        return ans;
    }
}