package main.java;

public class RotateImage {

    enum Direction {
        RIGHT,
        DOWN,
        LEFT,
        UP
    }

    Direction current_direction;

    public int replace(int[][] matrix, int row, int col, int insert_value) {
        int temp = matrix[row][col];
        matrix[row][col] = insert_value;
        return temp;
    }

    public void setDirection(int start, int end, int cur_col, int cur_row) {
        if (cur_col == start && cur_row ==start){
            current_direction = Direction.RIGHT;
        } else if (cur_col == end && cur_row == start){
            current_direction = Direction.DOWN;
        } else if (cur_col == end && cur_row == end) {
            current_direction = Direction.LEFT;
        } else if (cur_col == start && cur_row == end) {
            current_direction = Direction.UP;
        }
    }

    public int getNextColumn(int cur_col) {
        switch(current_direction){
            case RIGHT:
                return cur_col + 1;
            case LEFT:
                return cur_col - 1;
            default:
                return cur_col;
        }
    }
    
    public int getNextRow(int cur_row) {
        switch(current_direction){
            case DOWN:
                return cur_row + 1;
            case UP:
                return cur_row - 1;
            default:
                return cur_row;
        }
    }
    
    public void rotate(int[][] matrix) {

        int level = 0;
        int length = matrix[0].length - (2*level);
        int end = level + length -1;

        while (length > 1) {

            for (int col = level, row = level; col < end; col = col + 1) {
                int current_value = matrix[row][col], move_col = col, move_row = row;
                current_direction = Direction.RIGHT;

                for (int i = 0; i < 4; i = i + 1) {

                    for (int j = 0; j < length - 1; j++) {
                        setDirection(level, end, move_col, move_row);
                        move_col = getNextColumn(move_col);
                        move_row = getNextRow(move_row);
                    }

                    current_value = replace(matrix, move_row, move_col, current_value);
                }
            }

            level = level + 1;
            length = matrix[0].length - (2*level);
            end = level + length -1;
        }
    }
}
