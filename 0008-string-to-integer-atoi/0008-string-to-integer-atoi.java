class Solution {
    public int myAtoi(String s) {
        int n=s.length();
        int i=0;
        long result=0;
        int sign=1;
        while(i<n &&s.charAt(i)==' '){
            i++;
        }
        if(i<n&& (s.charAt(i)=='+' ||s.charAt(i)=='-')){
            sign=(s.charAt(i)=='-')?-1:1;
            i++;
        }
        while(i<n &&Character.isDigit(s.charAt(i))){
            result=result*10+(s.charAt(i)-'0');
            if(sign*result>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign*result<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)(sign*result);
    }
}