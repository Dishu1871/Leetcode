class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        if(n<t.length())return "";
        int requiredcount=t.length();
        int minwindowsize=Integer.MAX_VALUE;
        Map<Character,Integer>mp=new HashMap<>();
        for (char ch : t.toCharArray()){
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        int i=0;
        int j=0;
        int startindex=0;
        while(j<n){
            char c=s.charAt(j);
            if(mp.containsKey(c)&& mp.get(c)>0){
                requiredcount--;
            }
            mp.put(c,mp.getOrDefault(c,0)-1);
            while(requiredcount==0){
                int windowsize=j-i+1;
                if(minwindowsize>windowsize){
                    minwindowsize=windowsize;
                    startindex=i;
                }
                char ch=s.charAt(i);
                mp.put(ch,mp.getOrDefault(ch,0)+1);
                if(mp.containsKey(ch)&& mp.get(ch)>0){
                    requiredcount++;
                }
                i++;
            }
            j++;
        }
        return minwindowsize==Integer.MAX_VALUE?"":s.substring(startindex,startindex+minwindowsize);
    }
}