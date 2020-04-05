package Figures;

public class Square extends Figure {
    private double sideLength;
    private String color;

    public Square(String color, double sideLength){
        this.sideLength = sideLength;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println(color + "square!");
    }

    @Override
    public double getArea() {
        return sideLength*sideLength;
    }

    public double getSideLength(){
        return sideLength;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Figure: square, "
                + "color: " + getColor()
                + ", side: " + getSideLength()
                + ", area: " + getArea();
    }
}
