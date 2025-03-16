package bai5;

public class Main {
    public static void main(String[] args) {
        Colorable[] shapes = {
                new Circle(5.0, "Blue"),
                new Rectangle(4.0, 6.0, "Green"),
                new Square(3.0, "Yellow")
        };

        for (Colorable shape : shapes) {
            shape.setColor("Red");
        }
    }
}
