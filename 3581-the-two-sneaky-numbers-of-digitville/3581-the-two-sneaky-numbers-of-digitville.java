class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length-2;
        int arr[]=new int[n];
        int ans[]=new int[2];
        int index=0;
        for(int i:nums){
            arr[i]++;

            if(arr[i]==2){
                ans[index++]=i;
            }
        }
        return ans;        
    }
}