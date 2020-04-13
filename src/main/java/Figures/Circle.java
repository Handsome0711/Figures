package Figures;

public class Circle extends Figure {
    private String color;
    private double radius;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, "
                + "color: " + getColor()
                + ", radius: " + getRadius()
                + ", area: " + getArea());
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    public double getRadius(){
        return radius;
    }

    public String getColor() {
        return color;
    }
}
