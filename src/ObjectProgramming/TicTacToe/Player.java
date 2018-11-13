package ObjectProgramming.TicTacToe;

import java.util.Scanner;

public class Player {
    private char playerSign;
    Player(char playerSign){
        int[] actMove = new int [2];
        this.playerSign = playerSign;
        System.out.println("Player " + playerSign + " dolaczyl do gry");
    }

    public void getMove() {
        while (true) {

        }
    }
    static int readNumberFromConsole(int numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: " + numberInOrder);
        return  scanner.nextInt();
    }
}
