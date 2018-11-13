package ObjectProgramming.exercise.figure.Zad1Figure;

public class TestClas2 {
    public static void main(String[] args) {
        Figure[] figures = new Figure[4];

        figures[0] = new Rectangle(3,5);
        figures[1] = new Square(5);
        figures[2] = new Diamond(4,5);
        figures[3] = new Triangle(3,4,5);
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].countArea());
        }

    }
}
