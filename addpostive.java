public class addpostive {
    public static void postive(int arr[], int key) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != key) {
                System.out.println(arr[i]);

            }

        }

        // System.out.println("position of key:" + tr);

    }

    public static void main(String args[]) {
        int num[] = { 3, 4, 22, 13, 98, 50, 33, 30, 43, 22, 34 };
        int key = 30;
        postive(num, key);
    }

}
