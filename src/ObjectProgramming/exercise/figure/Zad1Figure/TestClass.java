package ObjectProgramming.exercise.figure.Zad1Figure;

public class TestClass {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("pole kwadratu = " + square.countArea());
        Square square2 = new Square(5);
        Square square3 = new Square(6);
        Rectangle rectangle = new Rectangle(5,5);
        System.out.println(square.equals(square2));
        System.out.println(square.equals(square3));
        System.out.println(square.equals(rectangle));
    }
}
