package ObjectProgramming.exercise.figure.Zad1Figure;

public class Triangle extends Figure {
    double a;
    double b;
    double c;

    Triangle(double a, double b, double c) {
        super("red");
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
