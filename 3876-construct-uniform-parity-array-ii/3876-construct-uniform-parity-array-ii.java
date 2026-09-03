class Solution {
    public boolean uniformArray(int[] nums1) {
        int minelement=Integer.MAX_VALUE;
        boolean alleven=true;
        for(int num:nums1){
            if(minelement>num){
                minelement=num;
            }
            if(num%2==1){
                alleven=false;
            }
        }
        if(minelement%2==1)return true;
        return alleven;
    }
}