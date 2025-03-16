package bai5;

public class Square implements Colorable {
    private double side;
    private String color;

    public Square() {

    }

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("Square color set to " + color);
    }
}
