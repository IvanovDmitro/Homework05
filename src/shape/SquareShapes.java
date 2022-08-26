package shape;

public interface SquareShapes {
    double square = 0;

    default double getSquare() {
        return square;
    }
}
