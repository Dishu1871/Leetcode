class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int []monthdays={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int alicestart=convert(arriveAlice,monthdays);
        int aliceend=convert(leaveAlice,monthdays);
        int bobstart=convert(arriveBob,monthdays);
        int bobend=convert(leaveBob,monthdays);
        int overlapstart=Math.max(alicestart,bobstart);
        int overlapend=Math.min(aliceend,bobend);
        return Math.max(0,overlapend-overlapstart+1);
    }
    public static int convert(String date,int []monthday){
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3));

        int totalDays = day;
        for (int i = 0; i < month - 1; i++) {
            totalDays += monthday[i];
        }
        return totalDays;
    }
}