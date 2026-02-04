class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][]board=new char[n][n];
        List<List<String>>ans =new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        solve(board,ans,n,0);
        return ans;
    
    }
    void solve(char[][]board,List<List<String>>ans,int n,int r){
        if(r==n){
            ArrayList<String>temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                String s=new String();
                for(int j=0;j<n;j++){
                    s+=board[i][j];
                }
                temp.add(s);
            }
            ans.add(temp);
            return ;
        }
        for(int j=0;j<n;j++){
            if(issafe(r,j,board)){
                board[r][j]='Q';
                solve(board,ans,n,r+1);
                board[r][j]='.';
            }
        }
    }
    boolean issafe(int row,int col,char[][]board){
        for(int i=0;i<row;i++){
           if(board[i][col]=='Q')return false; 
        }
        for(int i=row, j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q')return false;
        }
        for(int i=row, j=col;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q')return false;
        }
        return true;
    }
}