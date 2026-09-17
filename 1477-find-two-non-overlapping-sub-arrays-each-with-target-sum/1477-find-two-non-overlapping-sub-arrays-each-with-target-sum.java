class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int i=0;
        int j=0;
        int n=arr.length;
        int [] bestindextillnow=new int[n];
        Arrays.fill(bestindextillnow,Integer.MAX_VALUE);
        int sum=0;
        int bestindex=Integer.MAX_VALUE;
        int result=Integer.MAX_VALUE;
        while(j<n){
            sum+=arr[j];
            while(i<j&&sum>target){
                sum-=arr[i++];
            }
            if(sum==target){
                int length=j-i+1;
                if(i>0 && bestindextillnow[i-1]!=Integer.MAX_VALUE){
                    result=Math.min(result,length+bestindextillnow[i-1]);
                }
                bestindex=Math.min(bestindex,length);
            }
            bestindextillnow[j]=bestindex;
            j++;
        }
        return result==Integer.MAX_VALUE?-1:result;
    }
}