class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character,Integer>mp=new HashMap<>();
        int maxl=Integer.MIN_VALUE;
        int n=s.length();
        int i=0;
        int j=0;
        while(j<n){
            char c=s.charAt(j);
            mp.put(c,mp.getOrDefault(c,0)+1);
            while(mp.get(c)>2){
                char ch=s.charAt(i);
                mp.put(ch,mp.getOrDefault(ch,0)-1);
                i++;
            }
            maxl=Math.max(maxl,j-i+1);
            j++;
        }
        return maxl;
    }
}