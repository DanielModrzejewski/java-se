package ObjectProgramming.exercise.figure.Zad1Figure;

public class Square extends Rectangle {

    Square(double a) {
        super(a, a);
    }

    public void setA(double a) {
        this.a = a;
        this.b = a;
    }

    public void setB(double a) {
        this.a = a;
        this.b = a;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return  false;
        }
       if (obj instanceof Rectangle) {
           return this.a == ((Rectangle) obj).a && this.b == ((Rectangle) obj).b;
       } else {
           return false;
       }
    }
}
