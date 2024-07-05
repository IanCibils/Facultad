import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese sus Datos Por Favor ");

    System.out.println("Ingrese su Nombre Y Apellido:");
    String nombre = scanner.next();
    System.out.println("Ingrese la Carrera que esta cursando:");
    String carrera = scanner.next();
    System.out.println("Ingrese su numero de Cedula:");
    int cedula = scanner.nextInt();
    System.out.println("Ingrese su edad Por Favor");
    int edad = scanner.nextInt();

    System.out.println("Su Nombre es: " +nombre+ ", Carrera: " +carrera+ ", Cedula: " +cedula+ ", y su Edad: " +edad+ "\n son correctos los datos?");

    scanner.close();
    }
}
