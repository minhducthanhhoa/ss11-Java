package bai3;

public class Car extends Vehicle {
    public Car() {

    }
    public Car(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Name: " + name + ", Speed: " + speed + "km/h");
    }
}
