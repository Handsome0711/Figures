package Figures;

public class Main {
    public static void main(String[] args) {
        int numOfObjects = (int) (Math.random() * 100);
        for (int i = 1; i <= numOfObjects; i++) {
            Figure figure;
            int chooseFigure = (int) (Math.random() * 5);
            switch (chooseFigure) {
                case 1: {
                    figure = new Circle(getRandomColor(), Math.random() * 100);
                    System.out.println(figure.toString());
                    break;
                }
                case 2: {
                    figure = new Square(getRandomColor(), Math.random() * 100);
                    System.out.println(figure.toString());
                    break;
                }
                case 3: {
                    double smallestSize = Math.random() * 100;
                    double biggestSize = smallestSize + Math.random() * 100;
                    figure = new Trapeze(getRandomColor(), biggestSize, smallestSize, Math.random() * 100);
                    System.out.println(figure.toString());
                    break;
                }
                case 4:{
                    double aSide = Math.random() * 100;
                    double bSide = Math.random() * 100;
                    double cSide = Math.random() * aSide + bSide;
                    figure = new Triangle(getRandomColor(), aSide, bSide, cSide);
                    System.out.println(figure.toString());
                }
            }
        }
    }

    public static String getRandomColor() {
        String[] colors = new String[]{"red", "blue", "yellow", "black", "white", "green"};
        return colors[(int) (Math.random() * colors.length)];
    }
}
