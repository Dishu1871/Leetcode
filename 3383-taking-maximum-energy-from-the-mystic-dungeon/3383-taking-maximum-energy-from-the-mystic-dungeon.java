class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int[] ans = new int[n];
        int maxEnergy = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) { 
            int ni = i + k;
            if (ni >= n) { 
                ans[i] = energy[i];
            } else {
                ans[i] = energy[i] + ans[ni];
            }
            maxEnergy = Math.max(maxEnergy, ans[i]);
        }

        return maxEnergy;
    }
}