import java.util.Scanner;

class Operaciones {
    private double num1;
    private double num2;
    private double num3;
    private double num4;

    public Operaciones(double num1, double num2, double num3, double num4) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }

    public double suma() {
        return num1 + num2 + num3 + num4;
    }

    public double resta() {
        return num1 - num2 - num3 - num4;
    }

    public double multiplicacion() {
        return num1 * num2 * num3 * num4;
    }

    public double division() {
        return num1 / num2 / num3 / num4;
    }
}

public class EjercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Ingrese el tercer número:");
        double num3 = scanner.nextDouble();

        System.out.println("Ingrese el cuarto número:");
        double num4 = scanner.nextDouble();

        Operaciones operaciones = new Operaciones(num1, num2, num3, num4);

        System.out.println("La suma de los cuatro números es: " + operaciones.suma());
        System.out.println("La resta de los cuatro números es: " + operaciones.resta());
        System.out.println("La multiplicación de los cuatro números es: " + operaciones.multiplicacion());
        System.out.println("La división de los cuatro números es: " + operaciones.division());

        scanner.close();
    }
}
