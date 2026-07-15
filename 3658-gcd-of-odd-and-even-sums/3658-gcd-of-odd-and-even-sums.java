class Solution {
    int gcd(int evensum,int oddsum){
        if(oddsum==0)return evensum;
        return gcd(oddsum,evensum%oddsum);
    }
    public int gcdOfOddEvenSums(int n) {
        int evensum=(n*(4+(n-1)*2))/2;
        int oddsum=(n*(2+(n-1)*2))/2;
        return gcd(evensum,oddsum);
    }
}