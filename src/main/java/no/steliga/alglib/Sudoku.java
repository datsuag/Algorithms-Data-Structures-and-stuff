package no.steliga.alglib;


public class Sudoku {
    int[][] grid;
    public Sudoku(int[][] grid) {
        this.grid = grid;
    }

    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku(ArrayUtils.fill2d(new int[9][9], 0));
        sudoku.display();
        sudoku.solve();
        sudoku.display();
    }

    public void display() {
        for(int i = 0; i<grid.length;i++) {
            for(int j = 0; j<grid.length;j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }

    public boolean isValid(int row, int col, int n) {
        //Check Column
        for(int i = 0; i<grid.length;i++) {
            if(grid[i][col] == n) {
                return false;
            }
        }
        //Check Row
        for(int i = 0; i<grid.length;i++) {
            if(grid[row][i] == n) {
                return false;
            }
        }
        return true;
    }

    public void solve() {
        for(int i = 0; i<grid.length;i++) {
            for(int j = 0; j<grid.length;j++) {
                if(grid[i][j] == 0) {
                    for(int k = 1;k<=grid.length;k++) {
                        if(isValid(i, j, k)) {
                            grid[i][j] = k;
                        }

                    }
                }
            }
        }
    }






}
