class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int ans[]=new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            int num=nums.get(i);
            int can=-1;
            for(int j=1;j<num;j++){
                if((j|(j+1))==num){
                    can=j;
                    break;
                }
            }
            ans[i]=can;
        }
        return ans;
    }
}