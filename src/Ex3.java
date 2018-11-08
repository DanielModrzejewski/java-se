import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int firstNumber = readNumberFromConsole(1);
        int secoundNumber = readNumberFromConsole(2);
        int thirdNumber = readNumberFromConsole(3);

        int[] greatest = findGreatesNumbers(firstNumber,secoundNumber,thirdNumber);
        System.out.println(Arrays.toString(greatest));

    }

    static  int[] findGreatesNumbers(int... numbers){
        int resultCount = 0;

        int greaest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > greaest) {
                greaest = numbers[i];
            }
        }
        int greatestCount = 0;
        for (int i=0; i<numbers.length; i++) {
            if(numbers[i] == greaest){
                greatestCount++;
            }
        }

        int[] result = new int[greatestCount];
        for (int i = 0; i < greatestCount; i++) {
            result[i]=greaest;
        }

        return  result;
    }

    static int readNumberFromConsole(int numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: " + numberInOrder);
        return  scanner.nextInt();
    }
}
