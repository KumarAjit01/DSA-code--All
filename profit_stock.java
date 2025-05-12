import java.util.*;

public class profit_stock {
    public static int stock(int price[]) {
        int buying_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int i = 0; i < price.length; i++) {
            if (buying_price < price[i]) {
                int profit = price[i] - buying_price;
                max_profit = Math.max(profit, max_profit);
            } else {
                buying_price = price[i];
            }
        }
        return max_profit;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array length");
        int x = sc.nextInt();
        int price[] = new int[x];
        System.out.println("enter stock");
        for (int i = 0; i < price.length; i++) {
            price[i] = sc.nextInt();
        }
        System.out.println(stock(price));
        sc.close();
    }

}
