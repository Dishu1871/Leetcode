class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
       int n=nums.size();
       int currentRun=1;
       int previousRun=0;
       for(int i=1;i<n;i++){
        if(nums.get(i)>nums.get(i-1)){
            currentRun++;
        }else{
            previousRun=currentRun;
            currentRun=1;
        }
        if(currentRun>=2*k){
            return true;
        }
        if(Math.min(currentRun,previousRun)>=k){
            return true;
        }
       }
       return false; 
    }
}