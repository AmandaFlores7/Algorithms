package main.java.Ordenamientos;

import java.io.InputStream;
import java.util.Scanner;

public class MetodoBurbuja {

    public static void main(String[] args) {
        int numeros[] = readInput(System.in);
        bubbleSort(numeros);
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

    private static void bubbleSort(int[] numeros) {
        int aux;
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
    }
}
