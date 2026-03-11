class Solution {
    public int bitwiseComplement(int n) {
        int bits=(int)(Math.log(n)/Math.log(2))+1;
        int mask=(1<<bits)-1;
        return mask-n;
    }
}