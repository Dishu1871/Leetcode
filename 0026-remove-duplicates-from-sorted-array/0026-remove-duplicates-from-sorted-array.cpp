class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int n=nums.size(),val=nums[0];
        int count=1;
        for(int i=1;i<n;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                val=nums[i];
                count++;
            }
        }
        return count;
    }
};