class Solution {
public:
    int differenceOfSum(vector<int>& nums) {
        int element=0,digit=0;
        for(int i=0;i<nums.size();i++){
            element+=nums[i];
            while(nums[i]>0){
                digit+=nums[i]%10;
                nums[i]=nums[i]/10;
            }
        }
        return abs(element-digit);
    }
};