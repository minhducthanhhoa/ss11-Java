package bai4;

public class Main {
    public static void main(String[] args) {
        Electronic[] devices = { new TV(), new Radio() };

        for (Electronic device : devices) {
            device.turnOn();
            device.turnOff();
        }
    }
}
