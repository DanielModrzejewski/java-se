package ProceduralProgramming;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe 1");
        int firstNumber = in.nextInt();
        System.out.println("Podaj liczbe 2");
        int secondNumber = in.nextInt();
        System.out.println("Podaj operacje");
        System.out.println("+ dodawanie");
        System.out.println("- odejmowanie");
        System.out.println("* mnozenie");
        System.out.println("/ dzielenie");
        System.out.println("q zakoncz");
        String znak = in.next();

        if (!znak.equals("q")) {

            if (znak.equals("+")) {
                System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
            } else if (znak.equals("-")) {
                System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
            } else if (znak.equals("/")) {
                if(secondNumber==0){
                    System.out.println("nie dzielimy przez 0");
                } else {
                    System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
                }
            } else if (znak.equals("*")) {
                System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
            } else {
                System.out.println("nieprawidlowy znak operacji");
            }
        }
    }
}
