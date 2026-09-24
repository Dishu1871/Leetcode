class Solution {
    public int smallestAbsent(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int avg=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            avg+=nums[i];
        }
        avg/=n;
        if(avg<0){
            avg=0;
        }
        boolean found=false;
        while(found==false){
            if(!mp.containsKey(avg+1)){found=true;return (avg+1);}
            avg++;
        }
        return -1;
    }
}