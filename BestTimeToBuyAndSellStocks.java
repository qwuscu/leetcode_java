public class BestTimeToBuyAndSellStocks{
    public static void main(String [] args) throws Exception {
        int[] prices = {7,1,5,3,6,4};
        BestTimeToBuyAndSellStocks res = new BestTimeToBuyAndSellStocks();
        System.out.println(res.maxProfit(prices));
    }

    public int maxProfit(int[] prices){
        int minCost = Integer.MAX_VALUE;
        int maxPro = 0;
        for(int i=0; i < prices.length; i++) {
            if (prices[i] < minCost)
                minCost = prices[i];
            else if (prices[i]-minCost > maxPro)
                maxPro = prices[i]-minCost;
        }
        return maxPro;
    }
}

        // for(int i = 0 ; i < prices.length ; i++) {
        //     minCost = Math.min(minCost, prices[i]);
        //     maxProfit = Math.max(maxProfit, prices[i] - minCost);
        // }
