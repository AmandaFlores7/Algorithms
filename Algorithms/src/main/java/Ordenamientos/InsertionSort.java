/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.Ordenamientos;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author amand
 */
public class InsertionSort {

    public static void main(String[] args) {
        int numeros[] = readInput(System.in);
        insertionSort(numeros);
        printArray(numeros);
    }

    private static int[] readInput(InputStream in) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese total de numeros: ");
        int n = entrada.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Ingresa numero: ");
            numeros[i] = entrada.nextInt();
        }

        return numeros;
    }

    private static void printArray(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ", ");
        }
    }

    private static void insertionSort(int[] numeros) {
        if (numeros == null) {
            return;
        }

        if (numeros.length == 0 || numeros.length == 1) {
            return;
        }

        int pos, aux;
        for (int i = 0; i < numeros.length; i++) {
            pos = i;
            aux = numeros[i];

            while ((pos > 0) && (numeros[pos - 1] > aux)) {
                numeros[pos] = numeros[pos - 1];
                pos--;
            }

            numeros[pos] = aux;
        }
    }
}
