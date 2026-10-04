class Solution {
    public int[] diStringMatch(String s) {
       int n=s.length();
       int ans[]=new int[n+1];
       int left=0;
       int right=n;
       for(int i=0;i<n;i++){
        char c=s.charAt(i);
        if(c=='I'){
            ans[i]=left++;
        }else{
            ans[i]=right--;
        }
       } 
       ans[n]=s.charAt(n-1)=='I'?left:right;
       return ans;
    }
}