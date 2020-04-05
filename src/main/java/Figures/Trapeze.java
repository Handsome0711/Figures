package Figures;

public class Trapeze extends Figure {
    private String color;
    private double biggestBase;
    private double smallestBase;
    private double height;

    public Trapeze(String color, double biggestBase, double smallestBase, double height) {
        this.color = color;
        this.biggestBase = biggestBase;
        this.smallestBase = smallestBase;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("java.figures.Trapeze");
    }

    @Override
    public double getArea() {
        return ((biggestBase + smallestBase) / 2) * height;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }
    @Override
    public String toString() {
        return "Figure: trapeze, "
                + "color: " + getColor()
                + ", height: " + getHeight()
                + ", area: " + getArea();
    }

}
