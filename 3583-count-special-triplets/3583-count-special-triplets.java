class Solution {
    public int specialTriplets(int[] nums) {
        HashMap<Integer,Integer>left=new HashMap<>();
        HashMap<Integer,Integer>right=new HashMap<>();
        for(int i=2;i<nums.length;i++){
            right.put(nums[i],right.getOrDefault(nums[i],0)+1);
        }
        long count=0;
        int i=1;
        left.put(nums[0],1);
        while(i<nums.length){
            int required=2*nums[i];
            if(left.containsKey(required) && right.containsKey(required)){
               int a=left.get(required);
                int  b=right.get(required);
                count=(count+(1L*a*b))%1000000007;
            }
            left.put(nums[i],left.getOrDefault(nums[i],0)+1);
            if(i+1<nums.length){
                right.put(nums[i+1],right.get(nums[i+1])-1);
                if(right.get(nums[i+1])==0){
                    right.remove(nums[i+1]);
                }
            }
            i++;
        }
        return (int)count;
    }
}