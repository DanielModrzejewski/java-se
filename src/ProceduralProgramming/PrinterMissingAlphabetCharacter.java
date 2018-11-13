package ProceduralProgramming;

import java.util.Scanner;

public class PrinterMissingAlphabetCharacter {
    public static void main(String[] args) {
        String inputString = readStringFromConsole("Podaj string wejsciowy");
        PrintMissingAlphabetCaracter(inputString);
    }

    private static void PrintMissingAlphabetCaracter(String inputString) {
        char[] inputChar = inputString.toCharArray();
        char aCharacter = 'a';
        char zCharacter = 'z';
        int aInt = aCharacter;
        int zInt = zCharacter;
        boolean isInTable;
        char actualCharacter;
        for (int i = aInt; i <= zInt; i++) {
            isInTable=true;
            for (int j = 0; j < inputChar.length; j++) {
                if ((char)i == inputChar[j]) {
                    isInTable=false;
                    break;
                }
            }
            if (isInTable == true) {
                actualCharacter = (char) i;
                System.out.println(actualCharacter);
            }

        }
    }

    static String readStringFromConsole(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.next();
    }
}
