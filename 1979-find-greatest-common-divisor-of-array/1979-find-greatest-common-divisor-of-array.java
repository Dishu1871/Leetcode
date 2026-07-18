class Solution {
    int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
    public int findGCD(int[] nums) {
       int smallest=nums[0];
       int largest=nums[0];
       for(int i:nums){
        smallest=Math.min(smallest,i);
        largest=Math.max(largest,i);
       }
       return gcd(smallest,largest); 
    }
}