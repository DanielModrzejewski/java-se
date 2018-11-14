package ObjectProgramming.TicTacToe;

import java.util.Scanner;

public class Game {

    private int[] actMove = new int[2];
    private Player[] players = new Player[2];
    private int actPlayer = 0;
    private boolean endgame = false;
    Scanner scanner = new Scanner(System.in);

    public void startGame() {

        Board board = new Board(3);

        for (int i = 0; i < 2; i++) {
            System.out.println("Podaj symbol dla gracza " + (i+1));
            char sign = readCharFromConsole().charAt(0);
            players[i] = new Player(sign);
        }

        System.out.println(board.getStringBoard());

        while (endgame == false) {
            System.out.println("Tura gracza: " + players[actPlayer].getPlayerSign());
            do {
                getMove();
            } while (board.isCorrectMove(actMove) == false);
            board.actualBoard(actMove, players[actPlayer].getPlayerSign());
            System.out.println(board.getStringBoard());
            if (board.isWinner(players[actPlayer].getPlayerSign())) {
                System.out.println("Wygral gracz: " + players[actPlayer].getPlayerSign());
                endgame = true;
            } else if (board.isFull()) {
                System.out.println("Koniec gry, Remis");
                endgame = true;
            }
            actPlayer = actPlayer == 0 ? 1 : 0;
        }
    }

    private String readCharFromConsole() {
        return scanner.next();
    }
    private int readNumberFromConsole() {
        return scanner.nextInt();
    }
    private void getMove() {
        System.out.println("Podaj numer Wiersza");
        actMove[0] = readNumberFromConsole();
        System.out.println("Podaj numer Kolumby");
        actMove[1] = readNumberFromConsole();


    }
}
