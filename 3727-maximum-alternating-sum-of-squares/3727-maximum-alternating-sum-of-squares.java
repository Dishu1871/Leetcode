class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        long leftsum=0;
        long rightsum=0;
        for(int i=0;i<n/2;i++){
            leftsum+=nums[i];
        }
        for(int i=n/2;i<n;i++){
            rightsum+=nums[i];
        }
        return rightsum-leftsum;
    }
}