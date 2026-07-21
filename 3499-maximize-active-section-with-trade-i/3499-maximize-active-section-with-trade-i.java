class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int currzeros=0;
        int prevzeros=0;
        int ones=0;
        int maxconvertedonesfromzeros=0;
        int segmentofzeros=0;
        for(char c:s.toCharArray()){
            if(c=='0')currzeros++;
            else{
                ones++;
                maxconvertedonesfromzeros=Math.max(maxconvertedonesfromzeros,prevzeros+currzeros);
                if(currzeros!=0){
                    prevzeros=currzeros;
                    segmentofzeros++;
                }
                currzeros=0;
                
            }
        }
        if(currzeros!=0)segmentofzeros++;
        maxconvertedonesfromzeros=Math.max(maxconvertedonesfromzeros,prevzeros+currzeros);
        return ones + (segmentofzeros>1?maxconvertedonesfromzeros:0);
    }
}