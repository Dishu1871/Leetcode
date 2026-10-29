class Solution {
    public int subsetXORSum(int[] nums) {
        return backtrack(nums,0,0);
    }
    public int backtrack(int[]nums,int index,int xor){
        if(index==nums.length)return xor;
        int notinclude=backtrack(nums,index+1,xor);
        int include=backtrack(nums,index+1,xor^nums[index]);
        return notinclude+include;
    }
}