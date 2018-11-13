package ProceduralProgramming;

public class Logic {

    public static void main(String[] args) {

        boolean isCircle = true;
        double r = 5.25;

        if(isCircle && r > 10) {
            System.out.println("To jest duze kolo.");
        } else if (isCircle) {
            System.out.println("To jest male kolo.");
        } else {
            System.out.println("To ie jest w ogole kolo.");
        }

    }
}
