class Solution {
public:
    int mySqrt(int x) {
        if (x < 2) return x;

        int left = 1, right = x / 2, ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // To avoid overflow, compare mid with x / mid instead of mid * mid with x
            if (mid <= x / mid) {
                ans = mid;         // mid is a candidate
                left = mid + 1;    // try to find a larger one
            } else {
                right = mid - 1;   // mid is too large
            }
        }

        return ans; 
    }
};