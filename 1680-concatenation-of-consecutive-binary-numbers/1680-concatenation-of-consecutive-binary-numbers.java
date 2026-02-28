class Solution {
    int M = 1000000007;
    
    public int concatenatedBinary(int n) {
        long ans = 0;
        int digits = 0;

        for(int num = 1; num <= n; num++){
            if((num & (num - 1)) == 0){
                digits++;
            }
            ans = ((ans << digits) % M + num) % M;
        }

        return (int) ans;
    }
}