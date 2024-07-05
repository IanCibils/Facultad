import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pesoSandia;

        do {
            System.out.println("Cuanto pesa la sandia: ");
            pesoSandia = scanner.nextInt();
        } while (pesoSandia < 1 || pesoSandia > 2000);


        if (pesoSandia > 2 && pesoSandia % 2 == 0){
            pesoSandia = pesoSandia / 2;
            System.out.println("La sandia se pudo dividir en 2, con un peso par cada una de: " + pesoSandia);
        }
        else {
            float pesoParte = (float) pesoSandia / 2;
            System.out.println("La sandia no se pudo dividir en 2 en pesos pares, cada parte pesa: " + pesoParte);
        }

        scanner.close();

    }

}
