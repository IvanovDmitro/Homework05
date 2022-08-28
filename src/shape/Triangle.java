package shape;

public class Triangle implements Shape {
    private final double aSide;
    private final double bSide;
    private final double cSide;

    public Triangle(double aSide, double bSide, double cSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }

    public double calculateHalfPerimeter() {
        return (aSide + bSide + cSide) / 2.0;
    }

    @Override
    public double getSquare() {
        return Math.sqrt(calculateHalfPerimeter() * (calculateHalfPerimeter() - aSide)
                * (calculateHalfPerimeter() - bSide) * (calculateHalfPerimeter() - cSide));
    }
}



