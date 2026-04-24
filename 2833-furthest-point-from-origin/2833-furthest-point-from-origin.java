class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left=0;
        int right=0;
        int dash=0;
        for(char c:moves.toCharArray()){
            if(c=='L')left++;
            if(c=='R')right++;
            if(c=='_')dash++;
        }
        return Math.abs(left-right)+dash;
    }
}