class Solution {
public:
    int finalValueAfterOperations(vector<string>& operations) {
        int ans=0;
        for(string s:operations){
           if(s[1]=='+'){
            ans+=1;
           }else{
            ans-=1;
           }
        }
        return ans;
    }
};