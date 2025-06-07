
class Vehicle {
    public void drive() {
        System.out.println("The vehicle is in motion.");
    }
}

class Car extends Vehicle {
    private String make;
    private String model;
    private int year;


    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void display() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    @Override
    public void drive() {
        System.out.println("The " + make + " " + model + " is driving.");
    }
}

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("Toyota", "Camry", 2023);


        myCar.drive();

        myCar.display();
    }
}