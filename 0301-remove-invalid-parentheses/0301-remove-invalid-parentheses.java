class Solution {
        int maxlength;
        HashSet<String>st=new HashSet<>();
        int n;
    public List<String> removeInvalidParentheses(String s) {
        n=s.length();
        maxlength=0;
        int count=0;
        st.clear();
        StringBuilder sb=new StringBuilder();
        solve(0,count,s,sb);
        return new ArrayList<>(st);
    }
    public void solve(int i,int count,String s,StringBuilder curr){
        if(count<0)return;
        if(i==n){
            if(count==0){
                if(curr.length()>maxlength){
                    maxlength=curr.length();
                    st.clear();
                }
                if(curr.length()==maxlength){
                    st.add(curr.toString());
                }
            }
            return;
        }
        char c=s.charAt(i);
        if(c!='(' && c!=')'){
            curr.append(c);
            solve(i+1,count,s,curr);
            curr.deleteCharAt(curr.length()-1);
            return ;
        }  
        curr.append(c);
        solve(i+1,(c=='('?count+1:count-1),s,curr);
        curr.deleteCharAt(curr.length()-1);
        solve(i+1,count,s,curr);
    }
}