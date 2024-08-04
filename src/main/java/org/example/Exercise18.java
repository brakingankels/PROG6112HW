package org.example;

public class Exercise18 {
    public static void main(String[] args) {
        char[] chessboard; //array

        do {
            chessboard = getNewBoard();
            placeQueens(chessboard);
        }while (isAttacking(chessboard));
        print(chessboard);
        }
        public static int placeQueens(char[] chessboard) {
        return (int)(Math.random() * 64);
    }
    public static boolean isAttacking(char[] chessboard) {
        return isSameRow(chessboard) || isSameColumn(chessboard) || isSameDiagonal(chessboard);
    }
    public static boolean isSameRow(char[] chessboard) {
        int[] rows = new int[8];
        for(int i = 0; i < chessboard.length; i++) {
            if(isOccupied(chessboard[i])) {
                rows[getRow(i)]++;
            }
            if(rows[getRow(i)] > 1)
                return true;
        }
        return false;
    }
    public static boolean isSameColumn(char[] chessboard) {
        int[] columns = new int[8];
        for(int i = 0; i< chessboard.length; i++) {
            if(isOccupied(chessboard[i])) {
                columns[getColumn(i)]++;
            }
            if(columns[getColumn(i)] > 1)
                return true;
        }
        return false;
    }
    public static boolean isSameDiagonal(char[] chessboard) {
        for(int i = 0; i< chessboard.length; i++) {
            if(isOccupied(chessboard[i])) {
                for(int j = 0; j< chessboard.length; j++) {
                    if (isOccupied(chessboard[j]) && Math.abs(getColumn(j) - getColumn(i)) == Math.abs(getRow(j) - getRow(i)) && j != i) {
                        return true;
                    }
                }
            }
            }
        return false;
        }
        public static boolean isOccupied(char x) {
        return x == 'Q';
        }public static char[] getNewBoard() {
        char[] chessboard = new char[64];
        for(int i = 0; i< chessboard.length; i++)
            chessboard[i] = ' ';
        return chessboard;
    }
    public static void print(char[] chessboard) {
        for (int i = 0; i < chessboard.length; i++) {
            System.out.print(
                    "|" + ((getRow(i + 1) == 0) ? chessboard[i] + "|\n" : chessboard[i]));
    }
}
    public static int getRow(int index) {
        return index % 8;
    }

    /** getColumn returns the column number that corresponds to the given index */
    public static int getColumn(int index) {
        return index / 8;
    }
}
