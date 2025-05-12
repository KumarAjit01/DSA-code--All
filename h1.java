public class h1 {
    public static void main(String[] args) {
        calculator cal = new calculator();
        System.out.println(cal.sum(43.4f, 33));
        System.out.println(cal.sum(43f, 33f));
        System.out.println(cal.sum(22, 33, 44));

    }

}

class calculator {
    int sum(int a, int b) {
        return a + b;

    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
