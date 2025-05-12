public class abstr {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);

    }

}

abstract class animal {
    String color;

    animal() {
        color = "brown";

    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends animal {
    void changecolor() {
        color = "darkbrown";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }

}

class Chicken extends animal {
    void changecolor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("walks on 2 legs");
    }
}
