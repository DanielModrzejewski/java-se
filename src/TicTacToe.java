import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        boolean shouldContinue = true;
        int size = SetSize();
        char[][] board = new char[size][size];
        int[] field;
        char OorX = 'O';
        InitialBoard(board);
        DrawBoard(board);
        while (shouldContinue) {
            System.out.println("Tura: " + OorX);
            field = GetMoveFromPlayer(board);
            SetField(board, field, OorX);
            DrawBoard(board);
            shouldContinue = !ChekEndCondition(board, OorX);
            OorX = (OorX == 'O') ? 'X' : 'O';
        }
    }

    private static int SetSize() {
        return readNumberFromConsole("Okresl rozmiar tablicy do gry");
    }

    private static boolean ChekEndCondition(char[][] board, char OorX) {
        boolean someonWin = true;
        boolean noPlaceOnBoard = true;
        for (int i = 0; i < board.length; i++) {
            someonWin = true;
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != OorX) {
                    someonWin = false;
                }

            }
            if (someonWin == true) {
                ShowWinner(OorX);
                return true;
            }

        }
        for (int i = 0; i < board.length; i++) {
            someonWin = true;
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] != OorX) {
                    someonWin = false;
                }

            }
            if (someonWin == true) {
                ShowWinner(OorX);
                return true;
            }

        }
        someonWin = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] != OorX) {
                someonWin = false;
            }

        }
        if (someonWin == true) {
            ShowWinner(OorX);
            return true;
        }
        someonWin = true;
        for (int i = 0; i < board.length; i++) {
            if (board[board.length - i - 1][i] != OorX) {
                someonWin = false;
            }


        }
        if (someonWin == true) {
            ShowWinner(OorX);
            return true;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '?') {
                    noPlaceOnBoard = false;
                }
            }

        }

        if (noPlaceOnBoard == true) {
            System.out.println("Gra zakonczyla sie remisem");
            return true;
        }

        return false;
    }

    private static void ShowWinner(char OorX) {
        System.out.println("Wygral gracz " + OorX);
    }

    private static void SetField(char[][] board, int[] field, char OorX) {
        board[field[0]][field[1]] = OorX;
    }

    private static int[] GetMoveFromPlayer(char[][] board) {
        int[] result = new int[2];
        while (true) {

            int y = readNumberFromConsole("podaj numer kolumny");
            int x = readNumberFromConsole("podaj numer wiersza");
            if (IsCorrectField(x, y, board)) {
                result[0] = x;
                result[1] = y;
                return result;
            }


        }
    }

    private static boolean IsCorrectField(int x, int y, char[][] board) {
        if (x < 0 || x > board.length-1 || y < 0 || y > board.length-1) {
            System.out.println("Nie ma takiego pola, sproboj ponownie");
            return false;
        }
        if (board[x][y] != '?') {
            System.out.println("Pole zajete, sproboj ponownie");
            return false;
        }
        return true;
    }

    private static void InitialBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '?';
            }
        }
    }

    private static void DrawBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
                if (j<board[i].length-1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if(i<board.length-1) {
                for (int j = 0; j < board[i].length*2-1; j++) {
                    System.out.print("— ");
                }
                System.out.println();
            }
        }
    }

    static int readNumberFromConsole(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        return scanner.nextInt();
    }
}
