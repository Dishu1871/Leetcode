class Solution {
public:
    int dominantIndex(vector<int>& nums) {
        int largest = nums[0];
        int secondLargest = -1;
        int idx = 0;
        for(int i = 1; i < nums.size(); i++){
            if(nums[i] > largest){
                idx = i;
                secondLargest = largest;
                largest = nums[i];
            }
            else if(nums[i] < largest && nums[i] > secondLargest){
                secondLargest = nums[i];
            }
        }
        if(largest >= 2*secondLargest){
            return idx;
        }
        return -1;
    }
};