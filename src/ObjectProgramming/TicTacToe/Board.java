package ObjectProgramming.TicTacToe;

import java.util.Arrays;

public class Board {
    private Character[][] boardTable;
    private int sizeTable;
    private char emptyMark = ' ';
    Board (int size){
        this.boardTable = new Character[size][size];
        sizeTable=size;
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

    public boolean isCorrectMove(int x,int y){
        if (x<0 || x>sizeTable || y<0 || y>sizeTable) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isWinner(){
        char sign;
        for (int i = 0; i < sizeTable; i++) {
                sign = boardTable[i][0];
            for (int j = 0; j < sizeTable; j++) {
                if (boardTable[i][j] != sign || boardTable[j][i] != sign) {
                    break;
                }
                    return true;
            }

        }
        return false;
    }

    public Character[][] getBoardTable() {
        return boardTable;
    }

    public void printBoard() {

        System.out.println(Arrays.toString(boardTable[0]));
        System.out.println(Arrays.toString(boardTable[1]));
        System.out.println(Arrays.toString(boardTable[2]));

    }
}
