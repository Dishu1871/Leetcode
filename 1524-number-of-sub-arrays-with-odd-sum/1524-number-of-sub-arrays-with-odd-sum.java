class Solution {
    int mod =1000000007;
    public int numOfSubarrays(int[] arr) {
        int n=arr.length;
        int prefix[]=new int[n];
        int even=1;
        int odd=0;
        int result=0;
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<n;i++){
            if(prefix[i]%2==0){
                result=(result+odd)%mod;
                even++;
            }else{
                result=(result+even)%mod;
                odd++;
            }
        }
        return result;
    }
}