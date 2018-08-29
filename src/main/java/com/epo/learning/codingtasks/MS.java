package com.epo.learning.codingtasks;

public class MS {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        int[][] bombs1 = {{0, 2}, {2, 0}};
        System.out.println(mineSweeper(bombs1, 3, 3).toString()); //should return:
        // [[0, 1, -1],
        //  [1, 2, 1],
        //  [-1, 1, 0]]

        int[][] bombs2 = {{0, 0}, {0, 1}, {1, 2}};
        System.out.println(mineSweeper(bombs2, 3, 4).toString()); //should return:
        // [[-1, -1, 2, 1],
        //  [2, 3, -1, 1],
        //  [0, 1, 1, 1]]

        int[][] bombs3 = {{1, 1}, {1, 2}, {2, 2}, {4, 3}};
        System.out.println(mineSweeper(bombs3, 5, 5).toString());// should return:
        // [[1, 2, 2, 1, 0],
        //  [1, -1, -1, 2, 0],
        //  [1, 3, -1, 2, 0],
        //  [0, 1, 2, 2, 1],
        //  [0, 0, 1, -1, 1]]
    }

    // Implement your solution below.
    public static int[][] mineSweeper(int[][] bombs, int numRows, int numCols) {
        int[][] field = new int[numRows][numCols];
        for (int[] bomb : bombs) {
            int row_i = bomb[0];
            int col_i = bomb[1];
            field[row_i][col_i] = -1;
            for (int i = row_i - 1; i <= row_i + 1; i++) {
                for (int j = col_i - 1; j <= col_i + 1; j++) {
                    if((i >= 0) && (i < numRows) && (j>=0) && (j < numCols) && field[i][j] != -1) {
                        field[i][j] += 1;
                    }
                }
            }
        }

        return field;
    }
 }
