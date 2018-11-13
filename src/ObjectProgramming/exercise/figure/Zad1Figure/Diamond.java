package ObjectProgramming.exercise.figure.Zad1Figure;

import ObjectProgramming.exercise.figure.Zad1Figure.Figure;

public class Diamond extends Figure {
    private double e; //private - nikt z poza klasy nie zmieni tej wartosci
    public double f; //public - mozna zmieniac wartosc z poza klasy
    public double a;

    public Diamond(double e, double f) {
        super("red");
        this.e = e;
        this.f = f;
        this.a = Math.sqrt((e/2)*(e/2) + (f/2)*(f/2));
    }
    public Diamond(double e, double f, double a) {
        this(e,f);
        this.a = a;
    }

    public double countArea(){
        return e * f;
    }

    double countPeriphery(){
        return 4 * a;
    }
}
