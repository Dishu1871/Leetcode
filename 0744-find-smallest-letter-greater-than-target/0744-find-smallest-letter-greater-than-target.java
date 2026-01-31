class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int tar=target-'a';
        for(char c:letters){
            int x=c-'a';
            if(x>tar)return c;
        }
        return letters[0];
    }
}