class Solution {
    int solve(int val){
        int ans=0;
        while(val>0){
            ans+=val%10;
            val/=10;
        }
        return ans;
    }
    public int smallestIndex(int[] nums) {
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            int sum=solve(nums[i]);
            if(sum==i)return i;
        }
    return ans;
    }
}