class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        int maxprofit = 0;
        int left =0;
        for(int right=left+1;right<prices.length;right++){
            if(prices[left]>prices[right]){
                left=right;
            }
            profit = prices[right]-prices[left];
            maxprofit = Math.max(profit,maxprofit);
        }
        return maxprofit;
    }
}