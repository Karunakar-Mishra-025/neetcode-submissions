class Solution {
    public int maxProfit(int[] prices) {
        int maxRight[] = new int[prices.length];
        int max = prices.length - 1;

        for (int i = prices.length - 1; i >= 0; i--) {
            if (prices[max] < prices[i]) {
                max = i;
            }
            maxRight[i] = max;
        }
        int maxProfit=0;
        for(int i=0;i<maxRight.length;i++){
            int profit=prices[maxRight[i]]-prices[i];
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}
