class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n=nums.size(),sum=0;   
        int max=n*(n+1)/2;
        for(int i:nums){
            sum+=i;
        }
        return max-sum;
    }
};