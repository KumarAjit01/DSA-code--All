public class backtracking {

    public static void chnageArr(int arr[], int val, int idx) {
        if (idx == arr.length) {
            printarray(arr);
            System.out.println();
            return;
        }
        arr[idx] = val;
        chnageArr(arr, val + 1, idx + 1);
        arr[idx] = arr[idx] - 2;
    }

    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = new int[5];
        chnageArr(arr, 1, 0);
        printarray(arr);

    }

}
