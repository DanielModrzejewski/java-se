package ProceduralProgramming;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        double firstNumber;
        double secoundNumber;

        do {
            firstNumber = readNumberFromConsole(1);
            secoundNumber = readNumberFromConsole(2);
        } while (doOperation(firstNumber, secoundNumber));

    }

    private static boolean doOperation(double firstNumber, double secoundNumber) {
        String operator;

        while (true) {
            operator = readOperatorFromConsole();
            switch (operator) {
                case "+": {
                    System.out.println(firstNumber + secoundNumber);
                    return true;
                }
                case "-": {
                    System.out.println(firstNumber - secoundNumber);
                    return true;
                }
                case "*": {
                    System.out.println(firstNumber * secoundNumber);
                    return true;
                }
                case "/": {
                    System.out.println(firstNumber / secoundNumber);
                    return true;
                }
                case "q": {
                    return false;
                }
            }
        }
    }

    static double readNumberFromConsole(int numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: " + numberInOrder);
        return  scanner.nextDouble();
    }

    static String readOperatorFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj operacje");
        System.out.println("+ dodawanie");
        System.out.println("- odejmowanie");
        System.out.println("* mnozenie");
        System.out.println("/ dzielenie");
        System.out.println("q zakoncz");
        return  scanner.next();
    }
}
