class Solution {
    public int jump(int[] nums) {
        if (nums.length <= 1) return 0;

        int jumps = 0;
        int currentIndex = 0;

        while (currentIndex < nums.length - 1) {
            
         
            if (currentIndex + nums[currentIndex] >= nums.length - 1) {
                jumps++;
                break;
            }

            int bestNextIndex = currentIndex;
            int maxReach = 0;

          
            for (int i = currentIndex + 1; i <= currentIndex + nums[currentIndex]; i++) {
                if (i + nums[i] > maxReach) {
                    maxReach = i + nums[i];
                    bestNextIndex = i;
                }
            }

         
            currentIndex = bestNextIndex;
            jumps++;
        }

        return jumps;
    }
}