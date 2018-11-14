package ObjectProgramming.TicTacToe;

import java.util.Arrays;

public class Board {
    private char[][] boardTable;
    private int sizeTable;
    private static final char emptyMark = ' ';

    Board(int size) {
        this.boardTable = new char[size][size];
        sizeTable = size;
        InitialBoard();
    }

    private void InitialBoard() {
        for (int i = 0; i < boardTable.length; i++) {
            for (int j = 0; j < boardTable[i].length; j++) {
                boardTable[i][j] = emptyMark;
            }
        }
    }

    public boolean isFull() {
        for (int i = 0; i < sizeTable; i++) {
            for (int j = 0; j < sizeTable; j++) {
                if (boardTable[i][j] == emptyMark) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isCorrectMove(int actMove[]) {
        int x = actMove[0];
        int y = actMove[1];
        if (isOutOfBoard(x, y) || placeOnBoardIsNotEmpty(x, y)) {
            return false;
        } else {
            return true;
        }
    }

    private boolean placeOnBoardIsNotEmpty(int x, int y) {
        if (boardTable[x][y] != emptyMark) {
            System.out.println("Pole zajete, wskaz inne pole");
            return true;
        }
        return false;
    }

    public boolean isWinner(char sign) {
        boolean ween = true;
        for (int i = 0; i < sizeTable; i++) {
            ween = true;
            for (int j = 0; j < sizeTable; j++) {
                if (boardTable[i][j] != sign) {
                    ween = false;
                    break;
                }
            }
            if (ween == true) {
                return true;
            }
        }
        for (int i = 0; i < sizeTable; i++) {
            ween = true;

            for (int j = 0; j < sizeTable; j++) {
                if (boardTable[j][i] != sign) {
                    ween = false;
                    break;
                }
            }
            if (ween == true) {
                return true;
            }
        }
        ween = true;
        for (int i = 0; i < sizeTable; i++) {
            if (boardTable[i][i] != sign) {
                ween = false;
                break;
            }
        }
        if (ween == true) {
            return true;
        }
        ween = true;
        for (int i = 0; i < sizeTable; i++) {
            if (boardTable[i][sizeTable - i - 1] != sign) {
                ween = false;
                break;
            }
        }
        if (ween == true) {
            return true;
        }
        return false;
    }

    public String getStringBoard() {

        String stringBoard ="";
        for (int i = 0; i < sizeTable; i++) {
            for (int j = 0; j < sizeTable; j++) {
                stringBoard += (boardTable[i][j]);
                if (j<boardTable[i].length-1) {
                    stringBoard +=(" | ");
                }
            }
            stringBoard += "\n";
            if(i<sizeTable-1) {
                for (int j = 0; j < boardTable[i].length*2-1; j++) {
                    stringBoard +=("— ");
                }
                stringBoard += "\n";
            }
        }
        return stringBoard;

    }

    private boolean isOutOfBoard(int x, int y) {
        if (x < 0 || x >= sizeTable || y < 0 || y >= sizeTable) {
            System.out.println("Wartosc poza zakresem, wskaz inne pole");
            return true;
        } else {
            return false;
        }
    }

    public void actualBoard(int[] actMove, char sign) {
        boardTable[actMove[0]][actMove[1]] = sign;
    }
}
