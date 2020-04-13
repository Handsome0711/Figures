package Figures;

public class Main {
    public static void main(String[] args) {
        int numOfObjects = (int) (getRandom());
        for (int i = 1; i <= numOfObjects; i++) {
            Figure figure;
            int chooseFigure = (int) (Math.random() * 5);
            switch (chooseFigure) {
                case 1: {
                    figure = new Circle(getRandomColor(), getRandom());
                    figure.draw();
                    break;
                }
                case 2: {
                    figure = new Square(getRandomColor(), getRandom());
                    figure.draw();
                    break;
                }
                case 3: {
                    double smallestSize = getRandom();
                    double biggestSize = smallestSize + getRandom();
                    figure = new Trapeze(getRandomColor(), biggestSize, smallestSize, getRandom());
                    figure.draw();
                    break;
                }
                case 4: {
                    double aSide = getRandom();
                    double bSide = getRandom();
                    double cSide = Math.random() * aSide + bSide;
                    figure = new Triangle(getRandomColor(), aSide, bSide, cSide);
                    figure.draw();
                }
            }
        }
    }

    public static double getRandom() {
        return Math.random() * 100;
    }

    public static String getRandomColor() {
        Colors[] colors = Colors.values();
        return colors[(int) (Math.random() * colors.length)].getColor();
    }
}
