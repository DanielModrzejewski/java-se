package ProceduralProgramming;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int number = readNumberFromConsole(1);
        double result = powSum(number);
        System.out.println(result);

    }

    private static double powSum(int number) {
        if (number<=0) {
            return 0;
        } else {
            return Math.pow(number,2) + powSum(number-1);
        }
    }

    static int readNumberFromConsole(int numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: " + numberInOrder);
        return scanner.nextInt();
    }
}
