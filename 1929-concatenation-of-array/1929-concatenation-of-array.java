class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=2*nums.length;
     int ans[]=new int[n];
     int count=0;
     for(int i:nums){
        ans[count]=i;
        count++;
     }
     for(int i:nums){
        ans[count]=i;
        count++;
     }
     return ans;
    }
}