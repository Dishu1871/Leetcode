class Solution {
    int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int prefixgcd[]=new int[n];
        prefixgcd[0]=nums[0];
        int max=nums[0];
        for(int i=1;i<n;i++){
            max=Math.max(max,nums[i]);
            prefixgcd[i]=gcd(max,nums[i]);
        }
        Arrays.sort(prefixgcd);
        int i=0;
        int j=n-1;
        long sum=0;
        while(i<j){
            sum+=(long)gcd(prefixgcd[i],prefixgcd[j]);
            i++;
            j--;
        }
        
    return sum;
    }
}