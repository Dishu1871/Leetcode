class Solution {
    public int numOfWays(int n) {
        if(n==0)return 0;
    int mod=1000000007;
    long two=6,three=6;
    n--;
    while(n>0){
        long nexttwo=(2*three+3*two)%mod;
        three=(2*two+2*three)%mod;
        two=nexttwo;
        n--;
    }
    return (int)(two+three)%mod;
    }
}