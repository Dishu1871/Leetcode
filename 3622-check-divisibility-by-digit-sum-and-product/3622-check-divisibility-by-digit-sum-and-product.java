class Solution {
    public boolean checkDivisibility(int n) {
        int product=1;
        int sum=0;
        int num=n;
        while(n>0){
            int x=n%10;
            sum+=x;
            product*=x;
            n/=10;
        }
        if(num%(sum+product)==0)return true;
        return false;
    }
}