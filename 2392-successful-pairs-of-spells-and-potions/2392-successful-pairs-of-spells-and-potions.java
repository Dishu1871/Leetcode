class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int arr[]=new int[spells.length];
        for(int i=0;i<spells.length;i++){
            int low=0,high=potions.length-1;
            int index=potions.length;
            while(low<=high){
                int mid=low+(high-low)/2;
                long pro=(long)spells[i]*potions[mid];
                if(pro>=success){
                    index=mid;
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            arr[i]=potions.length-index;
        }
        return arr;
    }
}