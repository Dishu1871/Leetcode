class Solution {
public:
    int alternateDigitSum(int n) {
        int answer=0,numofdigits=0,digit;
        while(n>0){
            digit=n%10;
            numofdigits++;
            if(numofdigits%2==0){
                answer+=digit;
            }else{
                answer-=digit;
            }
            n/=10;
        }
       if (numofdigits % 2 == 0)
            return answer;
        else
            return -answer;
    }
};