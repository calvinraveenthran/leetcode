package main.java;

public class GameOfLife {

    int[][] currentBoard;

    public int checkSquare(int row, int col){
        if(row>= currentBoard.length || row < 0 || col >= currentBoard[0].length || col < 0)
            return 0;
        if(currentBoard[row][col] < 2)
            return currentBoard[row][col];

        else
            return (currentBoard[row][col]/10) % 10;
    }

    public int checkAllEightSquares(int row, int col) {
        int count = 0;

        count = count + checkSquare(row -1, col-1); // 10 pm
        count = count + checkSquare(row -1, col);   //12 pm
        count = count + checkSquare(row -1, col+1); // 2pm
        count = count + checkSquare(row, col+1); // 3 pm
        count = count + checkSquare(row+1, col+1); // 4pm
        count = count + checkSquare(row+1, col); // 6pm
        count = count + checkSquare(row+1, col -1); // 8pm
        count = count + checkSquare(row, col -1); // 9pm


        if(currentBoard[row][col] == 1) {
            if(count == 2 || count == 3) {
                return 111;
            } else{
                return 110;
            }
        } else if (count == 3) {
            return 101;
        }

        return 100;
    }

    public void gameOfLife(int[][] board) {
        currentBoard = board;

        for(int row = 0; row < currentBoard.length; row++) {
            for (int col = 0; col < currentBoard[0].length; col++) {
                board[row][col] = checkAllEightSquares(row, col);
            }
        }

        for(int row = 0; row < currentBoard.length; row++) {
            for (int col = 0; col < currentBoard[0].length; col++) {
                board[row][col] = board[row][col] % 10;
            }
        }
    }
}
