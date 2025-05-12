
public class arrprb3 {
    public static int stock(int price[]) {
        int max = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < price.length; i++) {
            if (max < price[i]) {
                int profit = price[i] - max;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                max = price[i];
            }
        }
        return maxprofit;
    }

    public static void main(String args[]) {
        int price[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(stock(price));
    }

}
