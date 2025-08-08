class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int frequency =0,maxel=0;
        for(int i:nums){
            if(frequency==0){
                maxel=i;
            }
            if(maxel==i){
                frequency++;
            }else{
                frequency--; 
            }
        }
        return maxel;
    }
};