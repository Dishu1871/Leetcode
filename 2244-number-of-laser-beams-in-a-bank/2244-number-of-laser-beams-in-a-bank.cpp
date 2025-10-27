class Solution {
public:
    int numberOfBeams(vector<string>& bank) {
        vector<int>array;
        for(int i=0;i<bank.size();i++){
            int count=0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i][j]=='1'){
                    count++;
                }
            }
            if(count!=0){
                array.push_back(count);
            }
            // count=0;
        }
        long ans=0;
        for(int i=1;i<array.size();i++){
            ans+=array[i-1]*array[i];
        }
        return ans;
    }
};