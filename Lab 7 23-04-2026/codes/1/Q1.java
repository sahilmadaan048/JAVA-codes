abstract class Vehicle {

    abstract void start();
    abstract void stop();

    void fuelType() {
        System.out.println("Vehicle uses fuel.");
    }

    void wheels() {
        System.out.println("Vehicle has wheels.");
    }
}

class Car extends Vehicle {

    void start() {
        System.out.println("Car starts with a key.");
    }

    void stop() {
        System.out.println("Car stops with brakes.");
    }
}

class Truck extends Vehicle {

    void start() {
        System.out.println("Truck starts with heavy ignition.");
    }

    void stop() {
        System.out.println("Truck stops using air brakes.");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.start();
        v1.stop();
        v1.fuelType();
        v1.wheels();

        Vehicle v2 = new Truck();
        v2.start();
        v2.stop();
    }
}