public class TimeTest {

    public static void main(String[] args) {

        double myPoint = 98.123;
        double myTimeHour = 10;
        double myTimeMinutes = 25;
        Hemisphere myHemisphere = Hemisphere.EAST;

        double destPoint = 123.123;
        Hemisphere destHemisphere = Hemisphere.WEST;

        final int minutesPerDeg = 4;

        double minuteDiff = 0.0;

        if (destHemisphere != myHemisphere) {
            destPoint *= -1;
        }

        if (myPoint > destPoint) {
            minuteDiff = (myPoint - destPoint) * 4;
        } else {
            minuteDiff = (destPoint - myPoint) * 4;
        }

        double myMinutes = myTimeHour * 60 + myTimeMinutes;
        double destMinutes = myMinutes + minuteDiff;

        int destTimeHour = (int) destMinutes / 60;
        int destTimeMinutes = (int) destMinutes % 60;
        // Dest point: 15:40

        if (destTimeHour > 24) {
            destTimeHour -= 24;
        }
        if (destTimeHour < 0) {
            destTimeHour += 24;
        }


        if (destTimeMinutes > 10) {
            System.out.println("Dest point: " + destTimeHour + ":" + destTimeMinutes);
        } else {
            System.out.println("Dest point: " + destTimeHour + ":0" + destTimeMinutes);
        }

    }

    enum Hemisphere {
        WEST, EAST
    }
}
