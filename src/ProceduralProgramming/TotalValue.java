package ProceduralProgramming;

import java.util.Scanner;

public class TotalValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita");
        int firstNumber = in.nextInt();

        if (firstNumber<0){
            firstNumber *= -1;
        }

        System.out.println("artosc bezwzgledna: " + firstNumber);
    }
}
