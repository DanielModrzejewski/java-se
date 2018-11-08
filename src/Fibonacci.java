import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita");
        int firstNumber = in.nextInt();
        int fibonachi = 0;
        int fnMinus1 = 1;
        int fnMinus2 = 0;

        switch (firstNumber) {
            case 0:
                fibonachi = 0;
                break;
            case 1:
                fibonachi = 1;
                break;
            default: {
                for (int i = 2; i <= firstNumber; i++) {
                    fibonachi = fnMinus1 + fnMinus2;
                    fnMinus2 = fnMinus1;
                    fnMinus1 = fibonachi;
                }
            }

        }
        System.out.println(fibonachi);

    }
}
