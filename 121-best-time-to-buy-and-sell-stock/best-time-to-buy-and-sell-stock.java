class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit=0;
        int buy_price=prices[0];
        for(int i=1;i<n;i++){
            int current=prices[i]-buy_price;
            if(current>profit){
                profit=current;
            }
            if(prices[i]<buy_price){
                buy_price=prices[i];
            }
        }
        return profit;
    }
}