/*Write a program to array elements print all Odd number
Sample Output
Array = {23, 45, 67, 34, 78}
Odd Array Elements = 23 45 67 */
public class arr_odd {
    public static void odd(int num[]) {
        int copyarr[] = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            copyarr[i] = num[i];

        }
        for (int i = 0; i < copyarr.length; i++) {
            System.out.print("copy arr" + copyarr[i] + " ");
        }

    }

    public static void main(String args[]) {
        int num[] = { 12, 34, 59, 45, 22 };
        odd(num);

    }

}
