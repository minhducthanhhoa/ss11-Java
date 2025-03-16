package bai3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 110);
        Bike bike = new Bike("Honda", 50);

        car.start();
        car.displayInfo();

        bike.start();
        bike.displayInfo();
    }
}
