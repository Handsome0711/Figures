package Figures;

public abstract class Figure {
    private String color;

    public abstract void draw();

    public abstract double getArea();

    public String getColor() {
        return color;
    }
}
