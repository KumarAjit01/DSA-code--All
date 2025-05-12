class Animal {
    String color;

    void eat() {
        System.out.println("this is eat function");
    }

    void breadth() {
        System.out.println("sas lena");
    }

}

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("water");
    }

}

public class copy {
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.swim();
        f1.eat();
    }

}
