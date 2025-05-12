public class lastkey {
    public static int lastocc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isfound = lastocc(arr, key, i + 1);
        if (isfound != -1) {
            return isfound;
        }
        // cheack itself
        if (arr[i] == key) {
            return i;
        }
        return isfound;

    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 3, 5, 7, 8, 9, 12, 41, 5, };
        int key = 5;
        System.out.println(lastocc(arr, key, 0));
    }
}
