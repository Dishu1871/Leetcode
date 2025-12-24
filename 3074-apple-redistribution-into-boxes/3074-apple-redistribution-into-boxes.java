class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int totalapples=0;
        for(int i:apple){
            totalapples+=i;
        }
        Arrays.sort(capacity);
        int boxes=0;
        int j=capacity.length-1;
        while(totalapples>0){
            totalapples-=capacity[j];
            boxes++;
            j--;
        }
        return boxes;
    }
}