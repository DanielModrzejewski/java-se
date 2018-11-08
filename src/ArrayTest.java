public class ArrayTest {

    public static void main(String[] args) {
        int xCoordinatesCount = 1000;
        int[] yCoordinates = {1,2,3,4};
        int[] yCoordinates2 = new int[5];
        yCoordinates2[0] =1;
        yCoordinates2[1] =2;
        yCoordinates2[2] =3;
        yCoordinates2[3] =4;
        yCoordinates2[4] =5;

        System.out.println(yCoordinates2[3]);

        int[] xCoordinates = new int [xCoordinatesCount];

        for (int i=0;i < xCoordinatesCount; i++) {
            xCoordinates[i] = i;
        }
        for (int i=0;i < xCoordinatesCount; i++) {
            System.out.println(xCoordinates[i]);
        }
    }
}
