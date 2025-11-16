class Solution {
    public int numSub(String s) {
        long ans=0,count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }else{
                ans+=((count+1)*count)/2;
                count=0;
            }
        }
        ans+=((count+1)*count)/2;
        return (int)(ans%1000000007);
    }
}