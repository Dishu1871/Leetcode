class Solution {
    public int minFlips(String s) {

        int n = s.length();
        int i = 0, j = 0;
        int result1 = 0, result2 = 0;
        int result = Integer.MAX_VALUE;

        while(j < 2*n) {
            char exp1=(j%2==0)?'0':'1';
            char exp2=(j%2==0)?'1':'0';
            if(s.charAt(j%n) != exp1) result1++;
            if(s.charAt(j%n) != exp2) result2++;


            if(j - i + 1 > n) {
                exp1=(i%2==0)?'0':'1';
                exp2=(i%2==0)?'1':'0';
                if(s.charAt(i%n) != exp1) result1--;
                if(s.charAt(i%n) != exp2) result2--;
                i++;
            }


            if(j - i + 1 == n)
                result = Math.min(result, Math.min(result1, result2));

            j++;
        }

        return result;
    }
}