class Solution {
    public int smallestNumber(int n) {
        int power=1;
        while(power<=n){
            power*=2;
        }
        return power-1;
    }
}