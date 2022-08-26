package shape;

public class Shape implements SquareShapes {
    double square;
    private double aside;

    public Shape(double aside) {
        this.aside = aside;
    }

    public Shape() {
    }

    public double getAside() {
        return aside;
    }

    @Override
    public double getSquare() {
        return square;
    }
}
