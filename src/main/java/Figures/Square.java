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
        System.out.println("Figure: square, "
                + "color: " + getColor()
                + ", side: " + getSideLength()
                + ", area: " + getArea());
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

}
