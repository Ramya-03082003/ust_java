
// Program2.java - Demonstrates abstraction using an abstract class
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class Program2 {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
    }
}
