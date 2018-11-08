public class Ex8 {
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

        pktLewa = countPkt(lewyLitery,tabPktLewy, inputChar);
        pktPrawa = countPkt(prawyLitery,tabPktPrawy, inputChar);

        System.out.println(pktLewa);
        System.out.println(pktPrawa);
    }

    private static int countPkt(char[] litery, int[] tabPkt, char[] inputChar) {
        int countingPkt = 0;
        for (int i = 0; i < inputChar.length; i++) {
            if (((i > 0) && (inputChar[i - 1] != '*')) && ((i < inputChar.length - 1) && (inputChar[i + 1] != '*'))) {
                for (int j = 0; j < litery.length; j++) {
                    if (inputChar[i] == litery[j] ) {
                        countingPkt += tabPkt[j];
                    }
                }
            }
        }
        return countingPkt;
    }
}
