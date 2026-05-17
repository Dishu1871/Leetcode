class Solution {
    boolean solve(int []arr,int i){
        if(i<0 ||i>=arr.length ||arr[i]<0)return false;
        if(arr[i]==0)return true;
        arr[i]*=-1;
        boolean left=solve(arr,i-arr[i]);
        boolean right=solve(arr,i+arr[i]);
        return left||right;
    }
    public boolean canReach(int[] arr, int start) {
        return solve(arr,start);
    }
}