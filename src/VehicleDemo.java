
class Vehicle {

    public void startEngine() {
        System.out.println("The vehicle engine has started.");
    }


    public void stopEngine() {
        System.out.println("The vehicle engine has stopped.");
    }
}
e
class Car extends Vehicle {

    public void drive() {
        System.out.println("The car is now in motion.");
    }
}


class Motorcycle extends Vehicle {

    public void ride() {
        System.out.println("The motorcycle is being ridden.");
    }
}


public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("--- Demonstrating Car Object ---");

        Car myCar = new Car();
        myCar.startEngine();
        System.out.println("\n--- Demonstrating Motorcycle Object ---");

        Motorcycle myMotorcycle = new Motorcycle();
        myMotorcycle.startEngine();
    }
}
