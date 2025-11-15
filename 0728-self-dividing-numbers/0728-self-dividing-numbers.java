class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer>ans=new ArrayList<Integer>();
        for(int i=left;i<=right;i++){
            String sc=String.valueOf(i);
            boolean ok=true;
            for(int j=0;j<sc.length();j++){
                char c=sc.charAt(j);
                int digit=c-'0';
                if(digit==0){
                    ok=false;
                    break;
                }
                // digit=c-'0';
                if(i%digit!=0){
                    ok=false;
                    break;
                }
            }
            if(ok) ans.add(i);
        }
        return ans;
    }
}