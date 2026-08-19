class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int []booked:reservedSeats){
            int row=booked[0];
            int seat=booked[1];
            int mask=1<<seat;
            if(mp.containsKey(row)&&mp.get(row)!=null){
                int val=mp.get(row);
                val=val|mask;
                mp.put(row,val);
            }else{
                mp.put(row,mask);
            }
        }
        int bookedA=(1<<2)|(1<<3)|(1<<4)|(1<<5);
        int bookedB=(1<<4)|(1<<5)|(1<<6)|(1<<7);
        int bookedC=(1<<6)|(1<<7)|(1<<8)|(1<<9);
        int result=(n-mp.size())*2;
        for(int val:mp.values()){
            int bookedmask=val;
            boolean A=((bookedA & bookedmask)==0);
            boolean B=((bookedB & bookedmask)==0);
            boolean C=((bookedC & bookedmask)==0);
            if(A&&C){
                result+=2;
            }
            else if(A||B||C){
                result+=1;
            }
        }
        return result;
    }
}