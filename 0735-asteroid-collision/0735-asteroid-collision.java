class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>st=new Stack<>();
        for(int n:asteroids){
            while(!st.isEmpty() && n<0 && st.peek()>0){
                int sum=n+st.peek();
                if(sum<0){
                    st.pop();
                }else if(sum>0){
                    n=0;
                }else{
                    st.pop();
                    n=0;
                }
            }
            if(n!=0)st.push(n);
        }
        int s=st.size();
        int []ans=new int[s];
        while(!st.isEmpty()){
            ans[s-1]=st.pop();
            s--;
        }
        return ans;
    }
}