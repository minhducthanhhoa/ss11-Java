package bai8;

public class Garage {
    private Car car1;
    private Car car2;

    public Garage(Car car1, Car car2) {
        this.car1 = car1;
        this.car2 = car2;
    }

    public void operateCars() {
        operateCar(car1);
        operateCar(car2);
    }

    private void operateCar(Car car) {
        car.start();
        car.stop();
        if (car instanceof Refuelable) {
            ((Refuelable) car).refuel();
        }
    }
}
