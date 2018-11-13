package ProceduralProgramming;

import java.util.Scanner;

public class RectangularTriangle {
    public static void main(String[] args) {
        System.out.println("Podaj dlugosci bokow trojkata abc");
        int a = readNumberFromConsole("Podaj a: ");
        int b = readNumberFromConsole( "Podaj b: ");
        int c = readNumberFromConsole( "Podaj c: ");

        System.out.println("Trojkat prostokatny? " + IsTheRectangularTriangle(a,b,c));

    }

    private static boolean IsTheRectangularTriangle(int a, int b, int c) {
        if (a*a + b*b == c*c) {
            return true;
        }
        if (c*c + b*b == a*a) {
            return true;
        }
        if (a*a + c*c == b*b) {
            return true;
        }
        return false;
    }

    static int readNumberFromConsole(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }
}
