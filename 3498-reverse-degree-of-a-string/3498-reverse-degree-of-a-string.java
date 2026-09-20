class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int reversedegree=26-(ch-'a');
            ans+=(i+1)*reversedegree;
        }
        return ans;
    }
}