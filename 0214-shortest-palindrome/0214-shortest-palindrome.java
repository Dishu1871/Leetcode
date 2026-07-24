class Solution {
    public String shortestPalindrome(String s) {
        if(s==null || s.length()<=1)return s;
        String rev=new StringBuilder(s).reverse().toString();
        String temp=s+'#'+rev;
        int pre=0;
        int suff=1;
        int lps[]=new int [temp.length()];
        Arrays.fill(lps,0);
        while(suff<temp.length()){
            if(temp.charAt(pre)==temp.charAt(suff)){
                lps[suff]=pre+1;
                pre++;
                suff++;
            }else{
                if(pre==0){
                    suff++;
                }else{
                    pre=lps[pre-1];
                }
            }
        }
        int longestcommonpartofs=lps[temp.length()-1];
        String longestnoncommonpartins=new StringBuilder(s.substring(longestcommonpartofs)).reverse().toString();
        return longestnoncommonpartins+s;
    }
}