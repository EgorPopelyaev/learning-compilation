package com.epo.learning.codingtasks;

import java.util.ArrayDeque;

public class MS2 {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        int[][] field1 = {{0, 0, 0, 0, 0},
                          {0, 1, 1, 1, 0},
                          {0, 1, -1, 1, 0}};

         click(field1, 3, 5, 2, 2);// should return:
        // [[0, 0, 0, 0, 0],
        //  [0, 1, 1, 1, 0],
        //  [0, 1, -1, 1, 0]]

         click(field1, 3, 5, 1, 4); // should return:
        // [[-2, -2, -2, -2, -2],
        //  [-2, 1, 1, 1, -2],
        //  [-2, 1, -1, 1, -2]]


        int[][] field2 = {{-1, 1, 0, 0},
                          {1, 1, 0, 0},
                          {0, 0, 1, 1},
                          {0, 0, 1, -1}};

         click(field2, 4, 4, 0, 1); // should return:
        // [[-1, 1, 0, 0],
        //  [1, 1, 0, 0],
        //  [0, 0, 1, 1],
        //  [0, 0, 1, -1]]

         click(field2, 4, 4, 1, 3);// should return:
        // [[-1, 1, -2, -2],
        //  [1, 1, -2, -2],
        //  [-2, -2, 1, 1],
        //  [-2, -2, 1, -1]]
    }

    // Implement your solution below.
    public static int[][] click(int[][] field, int numRows, int numCols, int givenI, int givenJ) {
        ArrayDeque<int[]> toCheck = new ArrayDeque<>();
        if (field[givenI][givenJ] == 0) {
            int[] coord = {givenI,givenJ};
            field[givenI][givenJ] = -2;
            toCheck.add(coord);
        } else {
            return field;
        }

        while (!toCheck.isEmpty()) {
            int[] currentPos = toCheck.remove();
            for (int i = currentPos[0] - 1; i <= currentPos[0] + 1; i++) {
                for (int j = currentPos[1] - 1; j <= currentPos[1] + 1; j++) {
                    if (0 <= i
                        && i < numRows
                        && 0 <= j
                        && j < numCols
                        && field[i][j] == 0) {
                        field[i][j] = -2;
                        int [] coord = {i,j};
                        toCheck.add(coord);
                    }
                }
            }
        }
        return field;
    }
 }
