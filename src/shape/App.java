package shape;

import utils.Rounder;

public class App {
    static Shape[] shape;
    static double sumSquare;
    static String result;

    public static void main(String[] args) {
        shape = new Shape[5];
        shape[0] = new Circle(10);
        shape[1] = new Triangle(5, 4, 3);
        shape[2] = new Square(13.1);
        shape[3] = new Square(18.1);
        shape[4] = new Circle(13.45);

        result = Rounder.roundValue(calcSumSquare());
        System.out.println("Total square of figures = " + result);
    }

    static double calcSumSquare() {
        for (int i = 0; i < shape.length; i++) {
            double square = shape[i].getSquare();
            sumSquare += square;
        }
        return sumSquare;
    }
}
