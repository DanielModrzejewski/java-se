import java.util.Scanner;

public class TheBigestInt {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe 1");
        int firstNumber = in.nextInt();
        System.out.println("Podaj liczbe 2");
        int secondNumber = in.nextInt();
        System.out.println("Podaj liczbe 3");
        int thirdNumber = in.nextInt();

        int theBigest = firstNumber;
        if (secondNumber > theBigest) {
            theBigest = secondNumber;
        }
        if (thirdNumber > theBigest) {
            theBigest = thirdNumber;
        }
        System.out.println("Najwieksza liczba: " + theBigest);

    }
}
