class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        solve(ans,nums,0);
        return ans;
    }
    private void solve(List<List<Integer>>ans,int[]nums,int index){
        if(index==nums.length){
            List<Integer>temp=new ArrayList<>();
            for(int i:nums){
                temp.add(i);
            }
            ans.add(temp);
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(nums,i,index);
            solve(ans,nums,index+1);
            swap(nums,i,index);
        }
    }
    private void swap(int[]nums,int i,int index){
        int temp=nums[i];
        nums[i]=nums[index];
        nums[index]=temp;
    }
}