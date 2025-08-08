class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int maxpro=0,lowp=prices[0];
        for(int values:prices){
            if(values>lowp){
                maxpro=max(maxpro,values-lowp);
            }
            lowp=min(lowp,values);
        }
        return maxpro;
    }
};