class Solution {
    public int totalNQueens(int n) {
        char board[][]=new char[n][n];
        List<List<String>>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        solve(board,ans,n,0);
        return ans.size();
    }
    void solve(char[][]board,List<List<String>>ans,int n,int r){
        if(r==n){
            List<String>add=new ArrayList<>();
            for(int i=0;i<n;i++){
                String temp=new String();
                for(int j=0;j<n;j++){
                    temp+=board[i][j];
                }
                add.add(temp);
            }
            ans.add(new ArrayList<>(add));
            return;
        }
        for(int j=0;j<n;j++){
            if(isSafe(board,r,j)){
                board[r][j]='Q';
                solve(board,ans,n,r+1);
                board[r][j]='.';
            }
        }
    }
    boolean isSafe(char[][]board,int row,int col){
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q')return false;
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q')return false;
        }
        for(int i=row-1,j=col+1;i>=0 &&j<board.length;i--,j++){
            if(board[i][j]=='Q')return false;
        }
        return true;
    }
}