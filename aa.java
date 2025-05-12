public class aa {
    public static void bubblesort(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public static void print(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
    }

    public static void main(String args[]) {
        int numbers[] = { 5, 1, 4, 3, 2 };
        bubblesort(numbers);
        print(numbers);
    }
}
