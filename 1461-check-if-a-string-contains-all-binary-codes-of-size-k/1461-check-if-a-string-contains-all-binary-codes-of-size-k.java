class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String>st=new HashSet<>();
        for(int i=0;i<=s.length()-k;i++){
            String t=s.substring(i,i+k);
            st.add(t);
        }
        if(st.size()==Math.pow(2,k))return true;
        return false;
    }
}