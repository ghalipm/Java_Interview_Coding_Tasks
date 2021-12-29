package JavaSE_Test.Practice.Nuance;

/**
 * The challenge
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * If you were only permitted to complete at most one transaction
 * (i.e., buy one and sell one share of the stock), design an algorithm
 * to find the maximum profit.
 *
 * Note that you cannot sell a stock before you buy one.
 */

public class Prices {


    public static void main(String[] args) {
        Prices prices=new Prices();

        int[] prices1={7,6,4,3,1};
        System.out.println("maxProfit(prices1) = " + prices.maxProfit(prices1));
        int[] prices2={7,1,5,3,6,4};
        System.out.println("maxProfit(prices2) = " + prices.maxProfit(prices2));

    }


    public int maxProfit(int[] prices) {
        // create a profit variable to return
        int maxprofit = 0;

        // loop through the original array (leave at least one day to sell)
        for (int i=0; i<prices.length-1; i++) {
            // loop through the array from the next item on
            for (int j=i+1; j<prices.length; j++) {
                // if next is greater than current
                if (prices[j]>prices[i]) {
                    // work out profit
                    int tmpProfit = prices[j]-prices[i];
                    // report the profit
                    if (tmpProfit>maxprofit) maxprofit = tmpProfit;
                }
            }
        }

        // return out profit
        return maxprofit;
    }

}
