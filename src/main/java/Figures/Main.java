package Figures;

public class Main {
    public static void main(String[] args) {
        int numOfObjects = (int) (getRandomSize());
        for (int i = 1; i <= numOfObjects; i++) {
            Figure figure;
            int chooseFigure = (int) (Math.random() * 5);
            switch (chooseFigure) {
                case 1: {
                    figure = new Circle(getRandomColor(), getRandomSize());
                    figure.draw();
                    break;
                }
                case 2: {
                    figure = new Square(getRandomColor(), getRandomSize());
                    figure.draw();
                    break;
                }
                case 3: {
                    double smallestSize = getRandomSize();
                    double biggestSize = smallestSize + getRandomSize();
                    Trapeze.TrapezeBuilder trapezeBuilder = new Trapeze.TrapezeBuilder();
                    figure = trapezeBuilder
                            .setBiggestBase(biggestSize)
                            .setColor(getRandomColor())
                            .setHeight(getRandomSize())
                            .setSmallestBase(smallestSize)
                            .build();
                    figure.draw();
                    break;
                }
                case 4: {
                    double aSide = getRandomSize();
                    double bSide = getRandomSize();
                    double cSide = Math.random() * aSide + bSide;
                    figure = new Triangle(getRandomColor(), aSide, bSide, cSide);
                    figure.draw();
                }
            }
        }
    }

    public static double getRandomSize() {
        return Math.random() * 100;
    }

    public static String getRandomColor() {
        Colors[] colors = Colors.values();
        return colors[(int) (Math.random() * colors.length)].getColor();
    }
}
