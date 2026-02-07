class Solution {
    public int minimumDeletions(String s) {
        int n=s.length();
        Stack<Character>st=new Stack<>();
        int count=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(!st.isEmpty() &&c=='a' &&st.peek()=='b'){
                st.pop();
                count++;
            }else{
                st.push(c);
            }
        }
        return count;
    }
}