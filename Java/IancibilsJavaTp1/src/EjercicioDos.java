import java.util.Scanner;

public class EjercicioDos {
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

        System.out.printf("Palabras ingresadas:%n%s%n%s%n%s%n%s%n%s%n", palabra1, palabra2, palabra3, palabra4, palabra5);
        System.out.printf("Números enteros ingresados:%n%d%n%d%n%d%n%d%n%d%n", entero1, entero2, entero3, entero4, entero5);
        System.out.printf("Números flotantes ingresados:%n%f%n%f%n%f%n%f%n%f%n", flotante1, flotante2, flotante3, flotante4, flotante5);

        scanner.close();
        }
}
