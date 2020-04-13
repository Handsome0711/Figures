package Figures;

public enum Colors {
    RED("red"),
    BLUE("blue"),
    YELLOW("yellow"),
    BLACK("black"),
    WHITE("white"),
    GREEN("green");
    private String color;

    Colors(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
