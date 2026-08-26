class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int i=0;
        int j=0;
        int ones=0;
        int n=s.length();
        String result=new String();
        while(j<n){
            char c=s.charAt(j);
            if(c=='1')ones++;
            while(ones>k || (i <= j && ones == k && s.charAt(i) == '0')){
                if(s.charAt(i)=='1')ones--;
                i++;
            }
            if(ones==k){
                String temp=s.substring(i,j+1);
                if(result.isEmpty()|| j - i + 1 < result.length()|| (j - i + 1 == result.length() && temp.compareTo(result) < 0)){
                    result=temp;
                }
            }
            j++;
        }
        return result;
    }
}