package ObjectProgramming.Exceptions;

import ObjectProgramming.exercise.figure.Zad1Figure.Figure;

public class Triangle extends Figure {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c)  throws  InvalidSideException {
        super("red");
        if (a<=0 || b<=0 || c<=0 ) {
            throw new InvalidSideException();
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double countArea() {
        double p = (a + b + c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
