package main.java;
import java.util.*;

public class NumberOfIslands {

    public int numIslands(char[][] grid) {

        int nr =0;

        for(int rw =0; rw < grid.length; rw++){
            for(int cl =0; cl < grid[0].length; cl++){
                if(grid[rw][cl] == '1'){
                    nr = nr + 1;
                    dfs(grid, rw, cl);
                }
            }
        }
        return nr;
    }

    public void dfs(char[][] grid, int rw, int cl) {

        if(rw < 0|| rw > grid.length -1 || cl <0 || cl > grid[0].length -1) {
            return;
        }

        if(grid[rw][cl] == '0') {
            return;
        }

        grid[rw][cl] = '0';
        dfs(grid, rw -1,cl);
        dfs(grid, rw +1,cl);
        dfs(grid, rw, cl -1);
        dfs(grid, rw, cl +1);
    }
}
