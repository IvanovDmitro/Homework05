package shape;

public class Triangle extends Shape implements SquareShapes {
    double height;

    public Triangle(double aside, double height) {
        super(aside);
        this.height = height;
    }

    @Override
    public double getSquare() {
        return 0.5 * height * getAside();
    }
}



