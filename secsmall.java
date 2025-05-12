public class secsmall {
    public static int second(int arr[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;

    }

    public static void main(String args[]) {
        int arr[] = { 20, 10, 5, 15, 2 };
        System.out.println(second(arr));
    }

}
