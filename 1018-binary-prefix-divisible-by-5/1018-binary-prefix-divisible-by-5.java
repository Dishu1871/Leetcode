class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>(nums.length);
        int cur = 0;

        for (int bit : nums) {
            cur=((cur*2)+bit)%5;
            res.add(cur==0);
        }

        return res;
    }
}