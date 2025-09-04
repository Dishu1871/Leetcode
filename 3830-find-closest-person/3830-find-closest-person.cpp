class Solution {
public:
    int findClosest(int x, int y, int z) {
        int xsteps=abs(z-x);
        int ysteps=abs(z-y);
        if(xsteps==ysteps) return 0;
        else if(xsteps>ysteps) return 2;
        else return 1;
    }
};