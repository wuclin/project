public class maxProfit {
    public int maxProfit(int[] prices) {
        int cost = Integer.MAX_VALUE, profit = 0;
        for (int price : prices){  //price：当天的价格 cost：当天前面几天中最低卖出价格
            cost = Math.min(price, cost);
            profit = Math.max(profit, price - cost);  //决定是前几天就卖出还是当天卖出

        }
        return profit;
    }
}
