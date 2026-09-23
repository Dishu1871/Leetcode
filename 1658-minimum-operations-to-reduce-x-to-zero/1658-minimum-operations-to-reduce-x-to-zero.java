class Solution {
    public int minOperations(int[] nums, int x) {
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        long target = totalSum - x;

        // If target is negative, sum(nums) < x, impossible to reach 0
        if (target < 0) {
            return -1;
        }

        // If target is 0, we must remove all elements
        if (target == 0) {
            return nums.length;
        }

        int left = 0;
        long currentSum = 0;
        int maxLen = -1;

        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];

            while (currentSum > target && left <= right) {
                currentSum -= nums[left];
                left++;
            }

            if (currentSum == target) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

      
        return maxLen == -1 ? -1 : nums.length - maxLen;
    }
}