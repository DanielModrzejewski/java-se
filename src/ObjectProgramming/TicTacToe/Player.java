package ObjectProgramming.TicTacToe;

import java.util.Scanner;

public class Player {
    private char playerSign;
    Scanner scanner = new Scanner(System.in);

    Player(char playerSign) {
        this.playerSign = playerSign;
        System.out.println("Player " + playerSign + " dolaczyl do gry");
    }


    private int readNumberFromConsole() {
        return scanner.nextInt();
    }

    public char getPlayerSign() {
        return playerSign;
    }
}
