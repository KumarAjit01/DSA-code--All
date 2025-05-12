public class method_overloadings {
    public static void main(string args[]) {
        calculator calc = new calculator();
        System.out.println(calc.sum(4, 3));
        System.out.println(calc.sum((float) 4.8, (float) 8.6));
        System.out.println(calc.sum(3, 2, 9));
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
