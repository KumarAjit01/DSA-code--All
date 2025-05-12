public class inhertitance {
    public static void main(String args[]) {
        Fish shark = new Fish();
        shark.eat();
        shark.Swim();
        shark.Breathe();
        shark.fins = 6;
        System.out.println(shark.fins);

    }

}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println(" i am eat eats");
    }

    void Breathe() {
        System.out.println("Breathes the fish");
    }
}

// Derived class
class Fish extends Animal {
    int fins;

    void Swim() {
        System.out.println("Swims in water");
    }

}
