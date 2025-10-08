class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] result = new int[spells.length];

        for (int i = 0; i < spells.length; i++) {
            int spell = spells[i];
            int left = 0, right = potions.length - 1;
            int index = potions.length;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                long product = (long) spell * potions[mid];

                if (product >= success) {
                    index = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            result[i] = potions.length - index;
        }

        return result;
    }
}