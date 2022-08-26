package shape;

public class Circle extends Shape implements SquareShapes {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getSquare() {
        return Math.PI * r * r;
    }
}
