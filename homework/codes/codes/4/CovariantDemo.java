// ==========================================
// Program 4: Covariant Return Type
// ==========================================

class Vehicle {

    Vehicle getVehicle() {
        return this;
    }
}

class Car extends Vehicle {

    // Covariant return type
    @Override
    Car getVehicle() {
        return this;
    }

    void display() {
        System.out.println("This is Car");
    }
}

public class CovariantDemo {

    public static void main(String[] args) {

        Car c = new Car();

        c.getVehicle().display();
    }
}