class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        int cand1 = 0, c1 = 0;
        int cand2 = 0, c2 = 0;
        for(int e:nums){
            if(c1==0 && e!=cand2){
                c1=1;
                cand1=e;
            }
            else if(c2==0 && e!=cand1){
                c2=1;
                cand2=e;
            }
            else if (e==cand1)c1++;
            else if (e==cand2)c2++;
            else{
                c1--;
                c2--;
            }
        }
         c1 = 0;
        c2 = 0;

        for (int e : nums) {
            if (e == cand1) c1++;
            else if (e == cand2) c2++;
        }

        int n = nums.length;

        if (c1 > n / 3) ans.add(cand1);
        if (c2 > n / 3) ans.add(cand2);

        return ans;
    }
}