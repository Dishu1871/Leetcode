class Solution {
    public int pivotInteger(int n) {
        long t = (long) n * (n + 1L) / 2L;
        long x = (long) Math.sqrt(t);
        if (x * x == t) {
            return (int) x;
        } else {
            return -1;
        }
    }
}