package OOPS;

public class car {
    public static class Car {
        String name;
        String type;
        int price;

    }

    public static void fun(Car x) {
        System.out.println(x.name);
        System.out.println(x.price);
    }

    public static void change(Car c) {
        System.out.println(c.name);
        c.name = "Ajit";
        return;
    }

    public static void main(String[] args) {
        Car c1 = new Car();

        c1.name = "Alto";
        c1.type = "BWE@#@";
        c1.price = 659321;
        change(c1);
        System.out.println(c1.name);

    }

}
