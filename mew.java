class Animal {
    void eat() {
        System.out.println("eating all animal");
    }
}

class cat extends Animal {
    void mouse() {
        System.out.println("cat mouse");
    }
}

class dog extends Animal {
    void bark() {
        System.out.println("dog are barking");
    }
}

class babydog extends dog {
    void small() {
        System.out.println("this is baby dog");
    }
}

public class mew {
    public static void main(String[] args) {
        babydog by = new babydog();
        by.small();
        by.bark();
        by.eat();
    }

}
