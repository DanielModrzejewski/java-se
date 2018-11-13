package ObjectProgramming.TicTacToe;

import java.util.Arrays;

public class Game {

    public void startGame(){
        Player[] players = new Player[2];
        players[0] = new Player('X');
        players[1] = new Player('Y');
        int actPlayer = 0;
        players[actPlayer].getMove();
        Board board = new Board(3);
        board.printBoard();
    }
}
