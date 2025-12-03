class Solution {
    public List<String> buildArray(int[] target, int n) {
     int length=target.length;
     int index=0;
     List<String>ans=new ArrayList<>();
     for(int i=1;i<=n;i++){
        if(i==target[index]){
            ans.add("Push");
            index++;
            if(index==length) break;
        }else{
            ans.add("Push");
            ans.add("Pop");
        }
     }  
     return ans; 
    }
}