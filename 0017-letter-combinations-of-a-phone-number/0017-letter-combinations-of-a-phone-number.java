class Solution {
    void solve(int index,List<String>ans,Map<Character,String>digitToLetters,StringBuilder temp,String digits){
        if(index==digits.length()){
            ans.add(temp.toString());
            return;
        }
        String letters=digitToLetters.get(digits.charAt(index));
        for(char letter:letters.toCharArray()){
            temp.append(letter);
            solve(index+1,ans,digitToLetters,temp,digits);
            temp.deleteCharAt(temp.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String>ans=new ArrayList<>();
        if(digits.length()==0 ||digits==null)return ans;
        Map<Character,String>digitToLetters=new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");

         StringBuilder temp =new StringBuilder();
         solve(0,ans,digitToLetters,temp,digits);
         return ans;
    }
}