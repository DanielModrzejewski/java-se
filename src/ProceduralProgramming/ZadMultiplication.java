package ProceduralProgramming;

import java.util.Scanner;

public class ZadMultiplication {
    public static void main(String[] args) {
        System.out.println("podaj 2 liczby");
        int a = readNumberFromConsole("a: ");
        int b = readNumberFromConsole("b: ");
        int result = MultiplyTwoNumbers(a,b);
        System.out.println("a * b = " + result);
    }

    private static int MultiplyTwoNumbers(int a, int b) {
        //return a*b;
        // without *
        int result = 0;
        for (int i = 0; i < Math.abs(a); i++) {
            result += b;
        }
        if (a<0) {
            result *= -1;
        }
        return result;
    }
    static int readNumberFromConsole(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }
}
