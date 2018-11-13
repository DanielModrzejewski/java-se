package ProceduralProgramming;

public class Exercise8 {
    public static void main(String[] args) {
        String imputString = "*aaawqbz*";
        int pktLewa = 0;
        int pktPrawa = 0;
        char bomba = '*';
        char [] lewyLitery = {'w','p','b','s'};
        int [] tabPktLewy = {4,3,2,1};
        char [] prawyLitery = {'m','q','d','z'};
        int [] tabPktPrawy = {4,3,2,1};
        char[] inputChar = imputString.toCharArray();

        for (int i = 0; i < inputChar.length; i++) {
            if(((i > 0) && (inputChar[i - 1] != '*')) && ((i < inputChar.length -1) && (inputChar[i+1] != '*'))) {
                for (int j = 0; j < lewyLitery.length; j++) {
                    if (inputChar[i] == lewyLitery[j] ) {
                        pktLewa += tabPktLewy[j];
                    }
                }
                for (int j = 0; j < prawyLitery.length; j++) {
                    if (inputChar[i] == prawyLitery[j]) {
                        pktPrawa += tabPktPrawy[j];
                    }
                }
            }
        }

        System.out.println(pktPrawa);
        System.out.println(pktLewa);
    }
}
