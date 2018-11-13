package ProceduralProgramming;

import java.util.Arrays;

public class ArrayPointerTest {
    public static void main(String[] args) {
        double[] xCoordinates = {10, 20, 30, 51.5};
        System.out.println(Arrays.toString(xCoordinates));
        int xSum = countSumOfElements(xCoordinates);
        System.out.println(Arrays.toString(xCoordinates));
    }

    private static int countSumOfElements(double[] xCoordinates) {
        int sum = 0;
        for (int i = 0; i < xCoordinates.length; i++) {
            sum += xCoordinates[i];
        }
        xCoordinates[1] = -5000;
        return sum;
    }
}
