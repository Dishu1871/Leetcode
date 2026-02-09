class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        int i=0,k=0;
        while(i<matrix.length){
            for(int j=matrix.length-1;j>k;j--){
                int temp=matrix[i][k];
                matrix[i][k]=matrix[i][j];
                matrix[i][j]=temp;
                k++;
            }
            k=0;
            i++;
        }
    }
}