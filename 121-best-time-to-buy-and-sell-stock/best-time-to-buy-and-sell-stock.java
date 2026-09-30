class Solution {
    public int maxProfit(int[] prices) {
      int n=prices.length;
      int buy_price=prices[0];
      int max_profit =0;
      for(int i=1;i<n;i++){
        if(prices[i]<buy_price){
         buy_price=prices[i];
        }
        else{
            int profit=prices[i]- buy_price;
            max_profit=Math.max(max_profit,profit);
        }
      } 
      return max_profit;   
    }
}