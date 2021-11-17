/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.Matriz;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author amand
 */
public class Simetric {

    public static void main(String[] args) {
        int matriz[][] = readInput(System.in);
        isSimetric(matriz);
    }

    private static int[][] readInput(InputStream in) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Matrix lenght: ");
        int n = scan.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the number on position " + i + ", " + j + " : ");
                matrix[i][j] = scan.nextInt();
            }
        }

        return matrix;
    }

    private static void isSimetric(int[][] matriz) {
        boolean flag = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    System.out.println("The matrix is not symmetric");
                    flag = false;
                    i = matriz.length;
                    j = i;
                }
            }
        }

        if (flag) {
            System.out.println("The matrix is symmetric");
        }
    }
}
