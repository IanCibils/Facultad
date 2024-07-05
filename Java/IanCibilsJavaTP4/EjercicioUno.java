import java.util.Arrays;

public class EjercicioUno {
    public static void main(String[] args) {
        int[] arreglo = {87, 60, 94, 100, 83, 78, 85, 91, 76, 87};


        int[] impares = new int[(arreglo.length + 1) / 2];


        for (int i = 0; i < arreglo.length; i += 2) {
            impares[i / 2] = arreglo[i];
        }


        Arrays.sort(arreglo);


        System.out.println("Arreglo ordenado:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();


        System.out.println("Valores en posiciones impares:");
        for (int num : impares) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
