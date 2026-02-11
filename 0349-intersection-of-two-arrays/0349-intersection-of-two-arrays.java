class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>s=new HashSet<>();
        for(int num:nums1){
            for(int nu:nums2){
                if(num==nu){
                    s.add(num);
                    break;
                }
            }
        }
        int[] ans = new int[s.size()];
        int i = 0;
        for (int n : s) ans[i++] = n;

        return ans;
    }
}