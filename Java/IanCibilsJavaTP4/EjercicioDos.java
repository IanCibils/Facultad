import java.util.Scanner;

public class EjercicioDos {

    public static void main(String[] args) {
        int[][] arregloA = new int[3][3];
        int[][] arregloB = new int[3][3];
        int[][] arregloSuma = new int[3][3];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese valores para el arreglo A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Valor fila " + (i + 1) + ", columna " + (j + 1) + ": ");
                arregloA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nIngrese valores para el arreglo B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Valor fila " + (i + 1) + ", columna " + (j + 1) + ": ");
                arregloB[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arregloSuma[i][j] = arregloA[i][j] + arregloB[i][j];
            }
        }

        System.out.println("\nArreglo A:");
        for (int[] fila : arregloA) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

        System.out.println("\nArreglo B:");
        for (int[] fila : arregloB) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

        System.out.println("\nArreglo Suma de A y B:");
        for (int[] fila : arregloSuma) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
