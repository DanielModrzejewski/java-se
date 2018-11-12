import java.util.Scanner;

public class EnumCalculation {
    public static void main(String[] args) {
        System.out.println("1. " + Operator.dodawanie);
        System.out.println("2. " + Operator.odejmowanie);
        System.out.println("3. " + Operator.mnozenie);
        System.out.println("4. " + Operator.dzielenie);
        int operator = readNumberFromConsole("");
        int iloscLiczb = readNumberFromConsole("podaj ilosc liczb");
       // int[] numbers =
    }
    public enum Operator {
        dodawanie, odejmowanie, mnozenie, dzielenie;
    }
    static int readNumberFromConsole(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }
}
