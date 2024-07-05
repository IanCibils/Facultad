import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        // Ingresar 10 numeros
        System.out.println("Ingrese 10 numeros: ");

        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Imprimir los numeros multiplos de 2 y los que no tambien
        System.out.println("Los multiplos de 2 son: ");

        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }

        System.out.println("Los numeros que no son multiplos de 2 son: ");

        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println(numeros[i]);
            }
        }

        scanner.close();
    }
}
