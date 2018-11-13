package ProceduralProgramming;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe 1");
        int firstNumber = in.nextInt();
        System.out.println("Podaj liczbe 2");
        int secondNumber = in.nextInt();
        System.out.println("Podaj liczbe 3");
        int thirdNumber = in.nextInt();

        System.out.println((firstNumber+secondNumber+thirdNumber)/3.0);
    }
}
