package com.company;

import java.util.Scanner;

public class Main {

        int[][] A = { { 1,2,3,4 }, { 5,6,7,8 } };
        int[][] B = { { 1,2 }, { 3,4}, {5,6}, {7,8} };

        public static int[][] multiplicar(int[][] A, int[][] B) {

            int aFilas = A.length;
            int aColumnas = A[0].length;
            int bFilas = B.length;
            int bColumnas = B[0].length;

            if (aColumnas != bFilas) {
                throw new Error("las matrices no son rectangulares");
            }

            int[][] C = new int[aFilas][bColumnas];
            for (int i = 0; i < aFilas; i++) {
                for (int j = 0; j < bColumnas; j++) {
                    C[i][j] = 0;
                }
            }

            for (int i = 0; i < aFilas; i++) {
                for (int j = 0; j < bColumnas; j++) {
                    for (int k = 0; k < aColumnas; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            return C;
        }

        public static void main(String[] args) {


            Main matrix = new Main();

            int[][] result = multiplicar(matrix.A, matrix.B);

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++)
                    System.out.print(result[i][j] + " ");
                System.out.println();
            }
        }
    }