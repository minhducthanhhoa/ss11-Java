package bai5;

public class Circle implements Colorable {
    private double radius;
    private String color;

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("Circle color set to " + color);
    }
}
