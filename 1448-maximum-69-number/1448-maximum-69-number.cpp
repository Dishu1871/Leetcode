#include<string>
class Solution {
public:
    int maximum69Number (int num) {
        string abc=to_string(num);
        for(char &i:abc){
            if(i=='6'){i='9';break;}
        }
        return stoi(abc);
    }
};