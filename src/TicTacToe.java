import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        boolean shouldContinue = true;
        char[][] board = new char[3][3];
        InitialBoard(board);
        while (shouldContinue) {
            DrawBoard(board);
            GetMoveFromPlayer(board);
            shouldContinue = false;
        }
    }

    private static void GetMoveFromPlayer(char[][] board) {
        while (true) {

                int x = readNumberFromConsole("podaj numer kolumny");
                int y = readNumberFromConsole("podaj numer wiersza");
                if (IsCorrectField(x,y, board)){
                    break;
                }


        }
    }

    private static boolean IsCorrectField(int x, int y, char [][] board) {
        if (x<0 || x>2 || y<0 || y>2){
            System.out.println("Nie ma takiego pola, sproboj ponownie");
            return false;
        }
        if (board[x][y]!='?') {
            System.out.println("Pole zajete, sproboj ponownie");
            return false;
        }
        return true;
    }

    private static void InitialBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j]='?';
            }
        }
    }

    private static void DrawBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int readNumberFromConsole(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        return  scanner.nextInt();
    }
}
