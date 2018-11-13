package ProceduralProgramming;

import java.util.Scanner;

public class SumPow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita");
        int firstNumber = in.nextInt();
        int sumPower = 0;

        for (int i=0; i<=firstNumber; i++) {
            sumPower += Math.pow(i,2);
        }
        System.out.println(sumPower);
    }
}
