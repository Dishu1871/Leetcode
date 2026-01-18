class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String>ans=new ArrayList<>();
        recurr(ans,n,0,0,"");
        return ans;
    }
    private void recurr(List<String>ans,int n,int open,int close,String bracketToPut){
        if(bracketToPut.length()==n*2){
            ans.add(bracketToPut);
            return ;
        }
        if(open<n){
            recurr(ans,n,open+1,close,bracketToPut+"(");
        }
        if(close<open){
            recurr(ans,n,open,close+1,bracketToPut+")");
        }
    }
}