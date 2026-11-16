class Solution {
    public String digitSum(String s, int k) {
        StringBuilder si=new StringBuilder(s);
       while(si.length()>k){
        si=solve(si.toString(),k);

       }
       return si.toString(); 
    }
    public StringBuilder solve(String s,int k){
        StringBuilder sb=new StringBuilder();
        int prefix=0;
        for(int i=0;i<s.length();i++){
            prefix+=s.charAt(i)-'0';
            if((i+1)%k==0){
                sb.append(prefix);
                prefix=0;
            }
            
        }
        if (s.length() % k != 0) {
            sb.append(prefix);
        }
        return sb;
    }
}