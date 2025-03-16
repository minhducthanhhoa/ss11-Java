package bai5;

public class Rectangle implements Colorable {
    private double length, width;
    private String color;

    public Rectangle() {

    }

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("Rectangle color set to " + color);
    }
}
