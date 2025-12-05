class Solution {
    public int countPartitions(int[] nums) {
        int sum = 0;
        for (int x : nums) sum += x;

        int prev = 0, count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            prev += nums[i];
            int right = sum - prev;

            if ((prev - right) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
