import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int number = readNumberFromConsole(1);
        int result = FibonacciRecurence(number);

        System.out.println(result);

    }

    private static int FibonacciRecurence(int number) {
        switch (number) {
            case 0:
                return 0;
            case 1:
                return 1;
            default: {
                    return FibonacciRecurence(number-1)+FibonacciRecurence(number-2);
            }

        }
    }

    static int readNumberFromConsole(int numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: " + numberInOrder);
        return scanner.nextInt();
    }
}
