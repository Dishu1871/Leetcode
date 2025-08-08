class Solution {
public:
    int maxArea(vector<int>& height) {
        int lp=0,fp=height.size()-1;
        int ans=0;
        while(lp<fp){
            int w=fp-lp;
            int h=min(height[fp],height[lp]);
            int area=w*h;
            ans=max(area,ans);
            height[lp]<height[fp]?lp++:fp--;
        }
        return ans;
    }
};