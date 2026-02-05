class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int move = nums[i];

            if (move > 0) {
                int newIndex = (i + move) % n;
                ans[i] = nums[newIndex];
            } 
            else if (move < 0) {
                int newIndex = (i + move) % n;
                if (newIndex < 0) {
                    newIndex += n;
                }
                ans[i] = nums[newIndex];
            } 
            else {
                ans[i] = nums[i];
            }
        }
        return ans;
    }
}
