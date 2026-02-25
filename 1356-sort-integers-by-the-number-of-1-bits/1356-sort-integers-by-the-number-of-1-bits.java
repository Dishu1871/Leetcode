class Solution {

    private int bitcount(int n){
        int c = 0;
        while(n > 0){
            if((n & 1) == 1){
                c++;
            }
            n >>= 1;
        }
        return c;
    }

    public int[] sortByBits(int[] arr) {

        Integer[] temp = new Integer[arr.length];

        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }

        Arrays.sort(temp, (a, b) -> {
            int countA = bitcount(a);
            int countB = bitcount(b);

            if(countA == countB){
                return a - b;
            }

            return countA - countB;
        });

        for(int i = 0; i < arr.length; i++){
            arr[i] = temp[i];
        }

        return arr;
    }
}