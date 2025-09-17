class Solution {
public:
    int minimumSum(int num) {
        vector<int>value;
        while(num>0){
            value.push_back(num%10);
            num/=10;
        }
        sort(value.begin(),value.end());
        int num1=value[3]+10*value[0];
        int num2=value[2]+10*value[1];
        return num1+num2;
    }
};