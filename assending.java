/*Q1 Write a program to Sort Numeric Array In Ascending Order
Sample Output

Array = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2}

Ascending Order = {2, 3, 3, 5, 20, 23, 30, 67, 70, 79} 
 Q@ desending order
 Q3 total sum
 Q4 avrg*/

public class assending {
    // public static void ording(int num[]) {
    // for (int i = 0; i < num.length; i++) {
    // for (int j = i + 1; j < num.length; j++) {
    // if (num[i] > num[j]) {
    // int temp = num[i];
    // num[i] = num[j];
    // num[j] = temp;

    // }
    // }
    // }
    // }
    public static void ording(int num[]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] < num[j]) {
                    int temp = num[j];
                    num[j] = num[i];
                    num[i] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        int num[] = { 23, 5, 67, 20, 3, 30, 79, 3, 70, 2 };
        ording(num);
        int local = 0;

        for (int i = 0; i < num.length; i++) {

            local = num[i] + local;
            System.out.print(num[i] + " ");
        }
        System.out.println("total value of sum:" + local);
        System.out.println("the averge of arr:" + local / num.length);
    }

}
