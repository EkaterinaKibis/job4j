package ru.kibis.dataTypes.array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        int count = 0;
        int countrow = 0;
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board.length; cell++) {
                char sign = board[row][cell];
                System.out.print(sign);
                // String sign = 'X';
                for (int i = 0; i < board.length; i++) {
                    if (sign == 'X') {
                        if (((cell + i) < board.length) && (board[row][(cell + i)] == 'X')) {
                            count++;
                        }
                        if (((row + i) < board.length) && (board[(row + i)][cell] == 'X')) {
                            countrow++;
                        }
                        if (((count == 1) && (countrow == 5)) || ((count == 5) && (countrow == 1))) {
                            result = true;
                        }
                    }
                }
            }
            System.out.println();
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] hasWinVertical = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean win = isWin(hasWinVertical);
        System.out.println("A board has a winner : " + win);
        System.out.println();
        char[][] hasWinHor = {
                {'_', '_', '_', '_', '_'},
                {'X', 'X', 'X', 'X', 'X'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
        };
        boolean winHor = isWin(hasWinHor);
        System.out.println("A board has a winner : " + winHor);
        System.out.println();
        char[][] notWin = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', 'X', '_', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean lose = isWin(notWin);
        System.out.println("A board has a winner : " + lose);
    }
}