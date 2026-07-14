class Solution {
    boolean helper(int[][] matrix, int target,int row){
        int start=0;
        int end=matrix[0].length-1;
        while(start<=end){
            int mid=start+(end-start/2);
            if(target==matrix[row][mid])return true;
            else if(target>matrix[row][mid]){
                start++;
            }else{
                end--;
            }   
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int start=0;
        int end=m-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>=matrix[mid][0] && matrix[mid][n-1]>=target){
                return helper(matrix,target,mid);
            }else if(target>matrix[mid][n-1]){
                start++;
            }else{
                end--;
            }
        }
        return false;
    }
}