class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        boolean isnegative= num<0;
        int a=Math.abs(num);
        StringBuilder sb =new StringBuilder();
        while(a>0){
            sb.append(a % 7);
            a/=7;
        }
        if (isnegative) sb.append("-");
        return sb.reverse().toString();
    }
}