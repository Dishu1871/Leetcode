class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n=nums.size(),curRun=1,prevRun=0,k=0;
        for(int i=1;i<n;i++){
            if(nums.get(i)>nums.get(i-1)){
                curRun++;
            }else{
                prevRun=curRun;
                curRun=1;
            }
            k=Math.max(k,curRun/2);
            k=Math.max(k,Math.min(prevRun,curRun));
        }
        return k;
    }
}