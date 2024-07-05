import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioCuatro {
    public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Ingrese sus Datos Por Favor ");

    System.out.println("Ingrese su Nombre Y Apellido:");
    String nombre = reader.readLine();
    System.out.println("Ingrese la Carrera que esta cursando:");
    String carrera = reader.readLine();
    System.out.println("Ingrese su numero de Cedula:");
    int cedula = Integer.parseInt(reader.readLine());
    System.out.println("Ingrese su edad Por Favor");
    int edad = Integer.parseInt(reader.readLine());

    System.out.println("Su Nombre es: " +nombre+ ", Carrera: " +carrera+ ", Cedula: " +cedula+ ", y su Edad: " +edad+ "\n son correctos los datos?");

    reader.close();

    }
}