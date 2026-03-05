class Solution {
    public int minOperations(String s) {
        int startwithzero=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                if(s.charAt(i)=='1'){
                    startwithzero++;
                }
            }else{
                if(s.charAt(i)=='0'){
                startwithzero++;
                }
            }
        }
        int startwithone=s.length()-startwithzero;
        return Math.min(startwithzero,startwithone);
    }
}