
// Program5.java - Demonstrates inheritance
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Program5 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
    }
}
