//import java.util.*;

public class suba {
    public static void arraye(int nums[]) {
        int sum = 0;
        int largest = 0;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                sum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(nums[k] + " ");
                    sum += nums[k];
                }
                System.out.println();

            }
            largest = (Math.max(largest, sum));
            smallest = (Math.min(smallest, sum));
            System.out.print("subarray sum is =:" + sum);

            System.out.println();

        }
        System.out.println("largest amount:" + largest);
        System.out.println("smallest amount:" + smallest);

    }

    public static void main(String args[]) {
        int num[] = { 1, -2, 6, -1, 3 };
        arraye(num);
    }

}
