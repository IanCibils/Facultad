import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primera palabra:");
        String palabra1 = scanner.next();
        System.out.println("Ingrese la segunda palabra:");
        String palabra2 = scanner.next();
        System.out.println("Ingrese la tercera palabra:");
        String palabra3 = scanner.next();
        System.out.println("Ingrese la cuarta palabra:");
        String palabra4 = scanner.next();
        System.out.println("Ingrese la quinta palabra:");
        String palabra5 = scanner.next();

        System.out.println("Ingrese el primer número entero:");
        int entero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número entero:");
        int entero2 = scanner.nextInt();
        System.out.println("Ingrese el tercer número entero:");
        int entero3 = scanner.nextInt();
        System.out.println("Ingrese el cuarto número entero:");
        int entero4 = scanner.nextInt();
        System.out.println("Ingrese el quinto número entero:");
        int entero5 = scanner.nextInt();

        System.out.println("Ingrese el primer número flotante:");
        float flotante1 = scanner.nextFloat();
        System.out.println("Ingrese el segundo número flotante:");
        float flotante2 = scanner.nextFloat();
        System.out.println("Ingrese el tercer número flotante:");
        float flotante3 = scanner.nextFloat();
        System.out.println("Ingrese el cuarto número flotante:");
        float flotante4 = scanner.nextFloat();
        System.out.println("Ingrese el quinto número flotante:");
        float flotante5 = scanner.nextFloat();

        System.out.println("Palabras ingresadas:");
        System.out.println(palabra1);
        System.out.println(palabra2);
        System.out.println(palabra3);
        System.out.println(palabra4);
        System.out.println(palabra5);

        System.out.println("Números enteros ingresados:");
        System.out.println(entero1);
        System.out.println(entero2);
        System.out.println(entero3);
        System.out.println(entero4);
        System.out.println(entero5);

        System.out.println("Números flotantes ingresados:");
        System.out.println(flotante1);
        System.out.println(flotante2);
        System.out.println(flotante3);
        System.out.println(flotante4);
        System.out.println(flotante5);

        scanner.close();

    }
}
