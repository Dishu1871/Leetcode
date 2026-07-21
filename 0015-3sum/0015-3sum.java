class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>>ans=new ArrayList<>();
        if(n==0)return ans;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            int sum=0;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while(j<k){
                sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                while(j<k && nums[j]==nums[j+1])j++;
                while(j<k && nums[k]==nums[k-1])k--;
                j++;
                k--;
                }
                else if(sum<0)j++;
                else k--;
            }
        }   
        return ans;
    }
}