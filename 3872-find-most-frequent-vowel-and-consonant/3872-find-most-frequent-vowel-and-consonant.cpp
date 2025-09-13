class Solution {
public:
    int maxFreqSum(string s) {
        int freq[26],maxc=0,maxv=0;
        for(char c:s){
            int i=c-'a';
            freq[i]++;
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                maxv=max(maxv,freq[i]);
            }else{
                maxc=max(maxc,freq[i]);
            }
        }
        return maxc+maxv;
    }
};