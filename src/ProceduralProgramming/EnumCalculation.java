package ProceduralProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class EnumCalculation {
    public static void main(String[] args) {
        System.out.println("1. " + Operator.dodawanie);
        System.out.println("2. " + Operator.odejmowanie);
        System.out.println("3. " + Operator.mnozenie);
        System.out.println("4. " + Operator.dzielenie);
        int operator = readNumberFromConsole("");
        int iloscLiczb = readNumberFromConsole("podaj ilosc liczb");
        int[] numbers = new int[iloscLiczb];
        if (iloscLiczb > 0){
            numbers = readXNumbers(iloscLiczb);
            System.out.println(Arrays.toString(numbers)); /// TODO: 13.11.18
        }


       // int[] numbers =
    }

    private static int[] readXNumbers(int iloscLiczb) {
        int[] result = new int[iloscLiczb];
        System.out.println("Podaj liczby");
        for (int i = 0; i < iloscLiczb; i++) {
            result[i]=readNumberFromConsole();
        }
        return result;
    }

    public enum Operator {
        dodawanie, odejmowanie, mnozenie, dzielenie;
    }
    static int readNumberFromConsole(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }
    static int readNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
