package ObjectProgramming.exercise.figure.Zad1Figure;

public class Rectangle extends Figure {
    protected double a;
    protected double b;

    Rectangle(double a, double b){
        super("Red");
        this.a =a;
        this.b=b;
    }

    public double countArea(){
        return a*b;
    }

    public double countPeriphery(){
        return 2*a + 2*b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
