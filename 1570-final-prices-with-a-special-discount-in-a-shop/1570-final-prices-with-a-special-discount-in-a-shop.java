class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer>ans=new Stack<>();
        for(int i=0;i<prices.length;i++){
            while(!ans.isEmpty()&& prices[ans.peek()]>=prices[i])
            prices[ans.pop()]-=prices[i];
            ans.push(i);
        }
        return prices;
    }
}