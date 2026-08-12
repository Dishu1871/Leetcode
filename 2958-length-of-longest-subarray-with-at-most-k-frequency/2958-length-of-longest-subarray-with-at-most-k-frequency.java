class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        int ans=Integer.MIN_VALUE;
        int i=0;
        int j=0;
        HashMap<Integer,Integer>mp=new HashMap<>();
        while(j<n){
            mp.put(nums[j],mp.getOrDefault(nums[j],0)+1);
            
            while(mp.get(nums[j])>k){
                mp.put(nums[i],mp.getOrDefault(nums[i],0)-1);
                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}