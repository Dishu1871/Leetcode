class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
    if (n < 2) return 0;
    int ogap = 0;
    Arrays.sort(nums);
    for (int i = 1; i < n; i++) {
        int gap = Math.abs(nums[i] - nums[i - 1]);
        ogap = Math.max(ogap, gap);
    }
    return ogap;
    }
}