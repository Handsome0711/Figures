package Figures;

public class Triangle extends Figure {
    private String color;
    private double aSide;
    private double bSide;
    private double cSide;

    public Triangle(String color, double aSide, double bSide, double cSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, "
                + "color: " + getColor()
                + ", biggest side: " + getBiggestSide()
                + ", area: " + getArea());
    }

    @Override
    public double getArea() {
        double p = (aSide + bSide + cSide) / 2;
        return Math.sqrt(p * (p - aSide) * (p - bSide) * (p - cSide));
    }

    public double getBiggestSide() {
        return aSide < bSide ? bSide : bSide < cSide ? cSide : aSide;
    }

    public String getColor() {
        return color;
    }
}
