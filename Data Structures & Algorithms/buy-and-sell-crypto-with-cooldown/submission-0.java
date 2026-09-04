class Solution {
    public int helper(int[] prices,int idx,int buy,int[][] dp){
        int n = prices.length;
        if(idx >= n) return 0;
        if(dp[idx][buy] != -1){
            return dp[idx][buy];
        }
        int profit =0;
        if(buy ==0){
            int buyStock = - prices[idx] + helper(prices,idx+1,1,dp);
            int skip = helper(prices,idx+1,0,dp);
            profit = Math.max(buyStock,skip);
        }
        else{
            int sell = prices[idx] + helper(prices,idx+2,0,dp);
            int skip = helper(prices,idx+1,1,dp);
            profit = Math.max(sell,skip);
        }
        return dp[idx][buy] = profit;
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n+1][3];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return helper(prices,0,0,dp);
    }
}
