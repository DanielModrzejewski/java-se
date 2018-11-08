public class FuncionTest {
    public static void main(String[] args) {

        int[] yCoordinates = {1, 2, 3, 4, 6};
        int[] xCoordinates = {5, 6, 7, 8, 9};

        int xCoordinateSum = countSumOfElements(xCoordinates);
        int yCoordinateSum = countSumOfElements(yCoordinates);
        System.out.println("Suma X to: " + xCoordinateSum);
        System.out.println("Suma Y to: " + yCoordinateSum);

        double xCoordinatesaverage = countAverageOfElements(xCoordinates);
        double yCoordinatesaverage = countAverageOfElements(yCoordinates);
        System.out.println("Srednia x to: " + xCoordinatesaverage);
        System.out.println("Srednia y to: " + yCoordinatesaverage);


    }

    static int countSumOfElements(int[] inputArrary) {
        int sum = 0;
        for (int i = 0; i < inputArrary.length; i++) {
            sum += inputArrary[i];
        }
        return sum;
    }

    static double countVelocity(double time, double route) {
        double velocity = route / time;
        return velocity;
    }

    static double countAverageOfElements(int[] inputArrary) {
        double sum = countSumOfElements(inputArrary);
        return sum / inputArrary.length;
    }
}
