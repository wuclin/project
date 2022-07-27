package dynamic;
//[7,1,5,3,6,4]
//[7,6,4,3,1]
public class maxProfitDemo {
    public int maxProfit(int[] prices) {
        int cost = Integer.MAX_VALUE, profit = 0;

        for (int price : prices){
            cost = Math.min(cost, price);
            profit = Math.max(profit, price - cost);
        }

        return profit;
    }
}
