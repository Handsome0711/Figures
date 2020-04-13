package Figures;

public class Trapeze extends Figure {
    private String color;
    private double biggestBase;
    private double smallestBase;
    private double height;

    private Trapeze(TrapezeBuilder trapezeBuilder) {
        this.color = trapezeBuilder.color;
        this.biggestBase = trapezeBuilder.biggestBase;
        this.smallestBase = trapezeBuilder.smallestBase;
        this.height = trapezeBuilder.height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapeze, "
                + "color: " + getColor()
                + ", height: " + getHeight()
                + ", area: " + getArea());
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

    public static class TrapezeBuilder {
        private String color;
        private double smallestBase;
        private double biggestBase;
        private double height;

        public TrapezeBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public TrapezeBuilder setSmallestBase(double smallestBase) {
            this.smallestBase = smallestBase;
            return this;
        }

        public TrapezeBuilder setBiggestBase(double biggestBase) {
            this.biggestBase = biggestBase;
            return this;
        }

        public TrapezeBuilder setHeight(double height) {
            this.height = height;
            return this;
        }

        public Trapeze build() {
            return new Trapeze(this);
        }
    }

}
