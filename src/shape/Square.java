package shape;

public class Square extends Shape implements SquareShapes {
    public Square(double aside) {
        super(aside);
    }

    @Override
    public double getSquare() {
        return getAside() * getAside();
    }
}
