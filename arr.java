
public class arr {

    // public static int get(int num[]) {
    // int largest = Integer.MIN_VALUE;
    // for (int i = 0; i < num.length; i++) {
    // if (largest < num[i]) {
    // largest = num[i];
    // }
    // }
    // return largest;

    // }

    public static int getsmall(int num[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        return smallest;
    }

    public static void main(String args[]) {
        int num[] = { 97, 98, 99, 44, 33, 21, 9, 55, 12, 1 };
        int x = getsmall(num);
        System.out.println("the largest number of nums:" + x);

    }
}
