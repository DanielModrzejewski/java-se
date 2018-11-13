package ProceduralProgramming;

public class ShortInt {
    public static void main(String[] args) {
        int year = -2000;
        String era;

        if (year < 0) {
            era = "BC";
        } else {
            era = "AD";
        }

        //to samo co wyzej tylko krocej
        era = year < 0 ? "BC" : "AC";
    }
}
