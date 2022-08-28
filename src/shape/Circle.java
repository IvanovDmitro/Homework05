package shape;

public class Circle implements Shape {
    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getSquare() {
        return Math.PI * r * r;
    }
}
