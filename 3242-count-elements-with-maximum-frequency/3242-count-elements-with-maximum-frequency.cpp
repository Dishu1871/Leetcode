class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        int freq[101],maxf=0,ans=0;
        for(int num:nums){
            freq[num]=freq[num]+1;
            maxf=max(freq[num],maxf);
        }
        for(int i=1;i<101;i++){
            if(maxf==freq[i]){
                ans+=maxf;
            }
        }
        return ans;
    }
};