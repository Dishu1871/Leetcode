class Solution {
public:
    vector<int> getNoZeroIntegers(int n) {
       for(int i=1;i<n;i++){
        int left=i;
        int right=n-i;
        if(!contain(left)&&!contain(right)){
            return {left,right};
        }
       } 
       return {};
    }
    bool contain(int n){
        string str=to_string(n);
        for(char c:str){
            if(c=='0') return true;
        }
        return false;
    }
};