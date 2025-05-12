import java.util.*;

public class oop3 {
    public static void main(String args[]) {
        dear d = new dear();
        d.eat();

    }
}

class animal {
    void eat() {
        System.out.println("eat anything");
    }
}

class dear extends animal {
    void eat() {
        System.out.println("eats only grass");
    }
}
