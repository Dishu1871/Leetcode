class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer>temp=new HashSet<>();
        for(int num:nums){
            if(temp.contains(num)){
                return num;
            }
            temp.add(num);
        }
        return -1;
    }
}