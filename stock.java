//import java.util.*;

public class stock {
    public static int buyandsell(int price[]) {
        int buyingprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < price.length; i++) {
            if (buyingprice < price[i]) {
                int profit = price[i] - buyingprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyingprice = price[i];
            }
        }
        return maxprofit;
    }

    public static void main(String args[]) {
        int price[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyandsell(price));
    }

}
