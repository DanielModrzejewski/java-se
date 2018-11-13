package ObjectProgramming.exercise.figure;

public class Rectangle extends Figure {
    protected double a;
    protected double b;

    public Rectangle(double a, double b) {
        super("czerwony");
        this.a = a;
        this.b = b;
    }

    public Rectangle(double a, double b, String color) {
        this(a,b);
        this.color=color;
    }

    public double countArea() {
        return a * b;
    }

    public double countPeriphery() {
        return 2 * a + 2 * b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
    public static double CountArea(double a, double b){
        return a * b;
    }
}
