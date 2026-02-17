class Solution {
    int countSetBits(int x) {
        int cnt = 0;
        while (x>0) {
            x &= (x - 1);
            cnt++;
        }
        return cnt;
    }
    public List<String> readBinaryWatch(int turnedOn) {
        ArrayList<String>ans=new ArrayList<>();
        for(int HH=0;HH<12;HH++){
            for(int MM=0;MM<60;MM++){
                if((countSetBits(HH)+countSetBits(MM))==turnedOn){
                    String time=String.valueOf(HH) +":";
                    if(MM<10) time+="0";
                    time+=String.valueOf(MM);
                    ans.add(time);
                }
            }
        }
        return ans;
    }
}