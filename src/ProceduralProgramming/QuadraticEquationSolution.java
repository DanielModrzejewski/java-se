package ProceduralProgramming;

import java.util.Scanner;

public class QuadraticEquationSolution {
    public static void main(String[] args) {
        System.out.println("ax^2 + bx + c = 0");
        int a = readNumberFromConsole(1, "Podaj a: ");
        int b = readNumberFromConsole(1, "Podaj b: ");
        int c = readNumberFromConsole(1, "Podaj c: ");

        double delta =Countdeta(a,b,c);
        System.out.println(delta);
        if (delta<0) {
            System.out.println("nie istnieje zeczywista delta");
        }else {
            if (delta == 0) {
                CountX(a,b);
            } else {
                CountX(a,b,delta);
            }
        }

    }

    private static void CountX(int a, int b) {
        double x = (-b) / (2 * a);
        System.out.println("X1 = " + x);
    }

    private static void CountX(int a, int b, double delta) {
        double x1 = ((-b) - Math.sqrt(delta)) / (2 * a);
        System.out.println("X1 = " + x1);
        double x2 = ((-b) + Math.sqrt(delta)) / (2 * a);
        System.out.println("X2 = " + x2);
    }

    private static double Countdeta(int a, int b, int c) {
        return (b*b)-4*a*c;
    }

    static int readNumberFromConsole(int numberInOrder, String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }
}
