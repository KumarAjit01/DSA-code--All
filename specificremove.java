public class specificremove {
    public static void removeElement(int array[], int specific) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] != specific) {
                System.out.print(array[i] + " ");
            }

        }

    }

    public static void main(String args[]) {
        int array[] = { 2, 4, 6, 8, 10, 12, 14 };
        int specific = 4;
        removeElement(array, specific);

    }

}
