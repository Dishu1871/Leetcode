class Solution {
public:
    int search(vector<int>& nums, int target) {
        int st=0,end=nums.size();
        while(st<end){
            int mid=st+(end-st)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target){
                end=mid;
            }else if(nums[mid]<target){
                st=mid+1;
            }
        }
        return -1;
    }
};