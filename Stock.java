public class Stock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int left = 0; // buy day
        int right = 1; // sell day

        while (right < prices.length) {
            if (prices[right] > prices[left]) {
        // profit possible
            int profit = prices[right] - prices[left];
            maxProfit = Math.max(maxProfit, profit);
        } else {
        // found a cheaper buying price
            left = right;
        }
        right++;
        }
        return maxProfit;  
    }

    public static void main(String[] args) {
        Stock stock = new Stock();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + stock.maxProfit(prices)); // Output: 5
    }  
}


