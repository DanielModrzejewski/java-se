package ProceduralProgramming;

public class LengthTest {
    public static void main(String[] args) {
        double coordinateX1 = 127.89;
        double coordinateY1 = 92.12;

        double coordinateX2 = 24.12;
        double coordinateY2 = 82.91;

        double length = Math.sqrt(Math.pow(coordinateX1 - coordinateX2, 2) + Math.pow(coordinateY1 - coordinateY2, 2));
        System.out.println(length);
    }
}
