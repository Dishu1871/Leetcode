class Solution {
public:
    long long flowerGame(int n, int m) {
        long a=n;
        long b=m;
        return (a+1)/2*(b/2)+(b+1)/2*(a/2);
    }
};