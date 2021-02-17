package main.java;

public class TicTacToe {

    int[][] player_col;
    int[][] player_row;
    int[][] player_diag;

    public TicTacToe(int n) {
        this.player_col = new int[2][n];
        this.player_row = new int[2][n];
        this.player_diag = new int[2][2];
    }

    public int move(int row, int col, int player) {


        int arr_col = col;
        int arr_row = row;
        int arr_player = player-1;
        int length = player_col[0].length;

        //Column logic
        player_col[arr_player][arr_col] +=1;
        if(player_col[arr_player][arr_col] == length)
            return player;

        //Row logic
        player_row[arr_player][arr_row] +=1;
        if(player_row[arr_player][arr_row] == length)
            return player;

        // Diagonal \ logic
        if(arr_col == arr_row){
            player_diag[arr_player][0] +=1;
            if(player_diag[arr_player][0] == length)
                return player;
        }

        //Diagonal / logic
        if(arr_col + arr_row == length -1){
            player_diag[arr_player][1] +=1;
            if(player_diag[arr_player][1] == length)
                return player;
        }

        return 0;
    }

}
