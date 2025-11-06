class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> si=new Stack<>();
        for(int i=0;i<s.length();i++){
            if((!si.isEmpty()) && s.charAt(i)==si.peek()){
                si.pop();
            }else{
                si.push(s.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c:si){
            sb.append(c);
        }
        return sb.toString();
    }
}