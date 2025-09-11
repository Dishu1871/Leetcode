class Solution {
public:
bool isvowel(char ch){
            ch=tolower(ch);
            return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
        }
    string sortVowels(string s) {
        vector<char>temp;
        for(char& c:s){
            if(isvowel(c)){
                temp.push_back(c);
            }
        }
        sort(temp.begin(),temp.end());
        int j=0;
        for(int i=0;i<s.length();i++){
            if(isvowel(s[i])){
                s[i]=temp[j];
                j++;
            }
        }
        return s;
    }
};