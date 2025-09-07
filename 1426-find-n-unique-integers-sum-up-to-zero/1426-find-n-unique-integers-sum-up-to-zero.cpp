class Solution {
public:
    vector<int> sumZero(int n) {
        vector<int>ans(n);
        int st=0,en=n-1;
        int temp=n/2;
        while(st<en){
            ans[st]=temp;
            ans[en]=-temp;
            temp--;
            st++;
            en--;
        }
        return ans;
    }
};