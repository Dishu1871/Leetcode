class Solution {
    public int totalMoney(int n) {
        int totalweeks=n/7;
        int remainingdays=n%7;
        int lastday=28+(totalweeks-1)*7;
        int totalmoney=totalweeks*(28+lastday)/2;
        int st=1+totalweeks;
        for(int i=1;i<=remainingdays;i++){
            totalmoney+=st;
            st++;
        }
        return totalmoney;
    }
}