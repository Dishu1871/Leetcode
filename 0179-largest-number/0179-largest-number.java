class Solution {
    public String largestNumber(int[] nums) {
        String store[]=new String[nums.length];
        int x=0;
        for(int i:nums){
            store[x++]=String.valueOf(i);
        }
        Arrays.sort(store,(a,b)->{
            String y=a+b;
            String z=b+a;
            return z.compareTo(y);
        });
        if (store[0].equals("0")) return "0";
        StringBuilder ans = new StringBuilder();
        for (String s : store) {
            ans.append(s);
        }

        return ans.toString();
    }
}