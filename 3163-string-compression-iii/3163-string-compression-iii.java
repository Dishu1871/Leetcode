class Solution {
    public String compressedString(String word) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<word.length();){
            int count=0;
            char c=word.charAt(i);
            while(i<word.length()&& word.charAt(i)==c && (count<9)){
                i++;
                count++;
            }
            sb.append(count).append(c);
        }
        return sb.toString();
    }
}