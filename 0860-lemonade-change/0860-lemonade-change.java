class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;

        if(bills[0]!=5)return false;
        
        for(int i:bills){
            if(i==5){
                five++;
            }else if(i==10){
                if(five<1){
                    return false;
                }
                five--;
                ten++;
               }
               else { 
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } 
                else if (five >= 3) {
                    five -= 3; 
                } 
                else {
                    return false;
                }
            }
                }
        return true;
            }
        }