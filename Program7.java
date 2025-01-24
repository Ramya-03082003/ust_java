
// Program7.java - Demonstrates interface implementation
interface Vehicle {
    void start();
    void stop();
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts");
    }

    public void stop() {
        System.out.println("Bike stops");
    }
}

public class Program7 {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        bike.start();
        bike.stop();
    }
}
