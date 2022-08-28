package shape;

public class Square implements Shape {
    private final double aSide;

    public Square(double aSide) {
        this.aSide = aSide;
    }

    @Override
    public double getSquare() {
        return aSide * aSide;
    }
}
