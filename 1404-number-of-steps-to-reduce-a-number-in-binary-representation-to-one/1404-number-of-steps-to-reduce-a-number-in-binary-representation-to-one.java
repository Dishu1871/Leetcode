class Solution {
    public int numSteps(String s) {
        int n=s.length()-1;
        int carry=0;
        int ans=0;
        for(int i=n;i>=1;i--){
            if((s.charAt(i)-'0'+carry)%2==1){
                ans+=2;
                carry=1;
            }
            else{
                ans+=1;
            }
        }
        return ans+carry;
    }
}