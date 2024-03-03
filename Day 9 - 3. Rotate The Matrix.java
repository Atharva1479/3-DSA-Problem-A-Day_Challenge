//Strivers A2Z DSA Sheet

//Array - Medium

// Rotate The Matrix

/* 
You are given a square matrix ‘Mat’ of size ‘N’. You need to rotate ‘Mat’ by 90 degrees in the clockwise direction.

Note:
You must rotate the matrix in place, i.e., you must modify the given matrix itself. You must not allocate another square matrix for rotation.
For example

When,
‘N’ = 2 and ‘Mat’ = {{1, 2}, {3, 4}}, we must modify ‘Mat’ to {{3, 1}, {4, 2}}. */

import java.util.*;

public class Solution {
    public static void rotateMatrix(int[][] mat) {

        int N = mat.length;

        for (int i = 0; i < N; i++) {

            for (int j = i + 1; j < N; j++) {

                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N / 2; j++) {
                
                int temp = mat[i][j];
                mat[i][j] = mat[i][N - j - 1];
                mat[i][N - j - 1] = temp;
            }
        }
    }
}
